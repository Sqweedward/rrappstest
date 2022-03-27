CREATE TABLE [dbo].[accounts](
                                 [id] [int] IDENTITY(1000,1) NOT NULL,
                                 [idClient] [int] NOT NULL,
                                 [num] [bigint] NOT NULL,
                                 [vkd] [int] NOT NULL,
                                 [balance] [money] NOT NULL,
                                 [lastOperdate] [datetime2](3) NULL,
                                 CONSTRAINT [PK_accounts] PRIMARY KEY CLUSTERED
                                     (
                                      [id] ASC
                                         )WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

CREATE SEQUENCE [dbo].[SequenceAcc]
    AS [bigint]
    START WITH 1000000000000000
    INCREMENT BY 1
    MINVALUE 1000000000000000
    MAXVALUE 1900000000000000
    CACHE
GO

CREATE TRIGGER [dbo].[accounts_INSERT]
    ON  [dbo].[accounts]
    INSTEAD OF INSERT
    AS
BEGIN
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    SET NOCOUNT ON;

    INSERT accounts
    SELECT idClient, NEXT VALUE FOR SequenceAcc, vkd, balance, lastOperdate
    FROM inserted;
END
GO

ALTER TABLE [dbo].[accounts] ENABLE TRIGGER [accounts_INSERT]
GO

