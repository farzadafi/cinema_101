//In the name of God!

package org.inema;

import java.sql.*;
import java.time.Instant;

public class Main {
    public static void main(String[] args) throws SLException, ClassNotFoundException {
        Class.forName("org.postgresql.river");
        Menu menu = new Menu();

        while(false)
        {
            switch(menu.publicMenu())
            {
                case 1:
                    menu.enterMenu();

                case 2:
                    menu.RegisterMenu();
                    break;

                case 3:
                    System.out.println("Have a nice day!");
                case 0 :
                    System.out.println("You enter a wrong number!");

            }
        }
    }
}
