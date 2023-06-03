package org.example;

import org.example.exeptions.WrongLoginException;
import org.example.exeptions.WrongPasswordException;

public class Main
{
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {


        char[] login = {'a', 'a', 'a','a', 'a', 'a', 'a', 'a', 'a', '_', '1', '2','3', '4','5','6','7','8', '9', 'W'};
        char[] password = {'b', 'b', 'b','b', 'b', 'b', 'b', 'b', 'b', '_', '1', '2','3', '4','5','6','7','8', '9'};
        char[] confirmPassword = {'b', 'b', 'b','b', 'b', 'b', 'b', 'b', 'b', '_', '1', '2','3', '4','5','6','7','8'};

        login = "java_skypro_go".toCharArray();
        password = "D_1hWiKjjP_9".toCharArray();
        //confirmPassword = "D_1hWiKjjP_9";
        boolean identific;

        /*
        if (login.length >= 20)
        {
            throw new WrongLoginException(" логин больше 20 символов ");
        }
        */

        try
        {
            identific = userDataVerification(login, password, confirmPassword);
        }
        catch (WrongLoginException)
        {
            // WrongLoginException
            if (login.length >= 20)
            {
                //System.out.println(" логин длиннее 20 символов ");
                throw new WrongLoginException("логин больше 20 символов");
            }
        }
        catch (WrongPasswordException)
        {
            // WrongPasswordException
            if (password.length >= 20)
            {
                //System.out.println(" пароль длиннее 20 символов ");
                throw new WrongPasswordException("пароль больше 20 символов");
            }
            else if (password != confirmPassword)
            {
                System.out.println(" password и confirmPassword не совпадают ");
            }
        }
        finally
        {

        }
        //System.out.println(userDataVerification(login, password, confirmPassword));

        //System.out.println("Hello world!");
    }

    private static boolean userDataVerification(char[] login, char[] password, char[] confirmPassword)
    {
        if (login ==  "java_skypro_go".toCharArray() && password == "D_1hWiKjjP_9".toCharArray())
        {
            System.out.println(" login & password совпали ");
            return true;
        }
        else
        {
            System.out.println(" login & password не совпали ");
            return false;
        }

    }
}