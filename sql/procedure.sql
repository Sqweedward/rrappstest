CREATE PROCEDURE [dbo].[GetAccountsByClientId]
    -- Add the parameters for the stored procedure here
@idClient int
AS
BEGIN
    -- SET NOCOUNT ON added to prevent extra result sets from
    -- interfering with SELECT statements.
    SET NOCOUNT ON;

    SELECT * from accounts where accounts.idClient = @idClient
END
GO