<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Login.aspx.cs" Inherits="Login.Login" Theme="" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body style="background-color: #252526">
    <form id="form1" runat="server">
        <div style="width: 1366px">
            <asp:Label ID="Label4" runat="server" ForeColor="White" Text="Internet Information Services"></asp:Label>
            <br />
            <asp:Label ID="Label1" runat="server" ForeColor="White" Text="账户"></asp:Label>
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            <br />
            <asp:Label ID="Label2" runat="server" ForeColor="White" Text="密码"></asp:Label>
            <asp:TextBox ID="TextBox2" runat="server" Font-Bold="False" Height="16px" MaxLength="5" OnTextChanged="TextBox2_TextChanged" TextMode="Password"></asp:TextBox>
            <br />
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="确定" Width="190px" />
            <br />
            <asp:Label ID="Label3" runat="server" ForeColor="White" Width="177px"></asp:Label>
        </div>
    </form>
</body>
</html>
