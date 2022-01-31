 String Username=jTextField1.getText();
        String Password=jPasswordField1.getText();
        if(Username.equals("admin")&& Password.equals("Pass"))
        {
             dispose();
        Admin obj= new Admin();
        obj.setVisible(true);


        }
        else
        {
           JOptionPane.showMessageDialog(null,"Username and password is incorrect :");
        }
