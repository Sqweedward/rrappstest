CREATE DATABASE [rrappstest]
    CONTAINMENT = NONE
    ON  PRIMARY
    ( NAME = N'rrappstest', FILENAME = N'D:\mssqlDb\rrappstest.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
    LOG ON
    ( NAME = N'rrappstest_log', FILENAME = N'D:\mssqlDb\rrappstest_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
    WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [rrappstest] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
    begin
        EXEC [rrappstest].[dbo].[sp_fulltext_database] @action = 'enable'
    end
GO
ALTER DATABASE [rrappstest] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [rrappstest] SET ANSI_NULLS OFF
GO
ALTER DATABASE [rrappstest] SET ANSI_PADDING OFF
GO
ALTER DATABASE [rrappstest] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [rrappstest] SET ARITHABORT OFF
GO
ALTER DATABASE [rrappstest] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [rrappstest] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [rrappstest] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [rrappstest] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [rrappstest] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [rrappstest] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [rrappstest] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [rrappstest] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [rrappstest] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [rrappstest] SET  DISABLE_BROKER
GO
ALTER DATABASE [rrappstest] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [rrappstest] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [rrappstest] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [rrappstest] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [rrappstest] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [rrappstest] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [rrappstest] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [rrappstest] SET RECOVERY SIMPLE
GO
ALTER DATABASE [rrappstest] SET  MULTI_USER
GO
ALTER DATABASE [rrappstest] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [rrappstest] SET DB_CHAINING OFF
GO
ALTER DATABASE [rrappstest] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF )
GO
ALTER DATABASE [rrappstest] SET TARGET_RECOVERY_TIME = 0 SECONDS
GO
ALTER DATABASE [rrappstest] SET DELAYED_DURABILITY = DISABLED
GO
ALTER DATABASE [rrappstest] SET ACCELERATED_DATABASE_RECOVERY = OFF
GO
ALTER DATABASE [rrappstest] SET QUERY_STORE = OFF
GO
USE [rrappstest]
GO