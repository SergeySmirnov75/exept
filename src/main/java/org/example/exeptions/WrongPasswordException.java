package org.example.exeptions;

public class WrongPasswordException extends Throwable
{
    public WrongPasswordException(String message)
    {
        super(message);
    }
}
