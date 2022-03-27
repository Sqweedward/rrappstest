CREATE TABLE [dbo].[clients](
                                [id] [int] IDENTITY(100,1) NOT NULL,
                                [fio] [nvarchar](50) NOT NULL,
                                CONSTRAINT [PK_clients] PRIMARY KEY CLUSTERED
                                    (
                                     [id] ASC
                                        )WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[accounts] ADD  CONSTRAINT [DF_accounts_balance]  DEFAULT ((0)) FOR [balance]
GO