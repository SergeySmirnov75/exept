package org.example;

import org.example.exeptions.WrongLoginException;
import org.example.exeptions.WrongPasswordException;

public class Main
{


    public static void main(String[] args)
    {
        //  login       java_skypro_go
        // password     D_1hWiKjjP_9
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";


        try
        {
            userDataVerification(login, password, confirmPassword);
        }
        catch (WrongLoginException ex)
        {
            System.out.println("Длина логина или пароля более 20 символов");
        }
        catch (WrongPasswordException ex)
        {
            System.out.println("Проверьте правильность написания пароля");
        }
        finally
        {
            System.out.println(" проверка окончена ");
        }

    }

    public static boolean userDataVerification(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException
    {

        int maxLoginLength = 20;
        int maxPassLength = 20;

        if (login.length() >= maxLoginLength || password.length() >= maxPassLength)
        {
            throw new WrongLoginException();
        }
        if (!password.equals(confirmPassword) || !password.matches("[a-zA-Z0-9_]+"))
        {
            throw new WrongPasswordException();
        }
        return true;
    }
}