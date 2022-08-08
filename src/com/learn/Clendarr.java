package com.learn;

import javax.naming.AuthenticationException;
import javax.naming.AuthenticationNotSupportedException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Clendarr {

    public static void main(String[] args) {

        List a = Stream
                .of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(x -> x % 2 == 0)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(a);

        String url = "ldaps://10.10.0.160:636";
        System.setProperty("com.sun.jndi.ldap.object.disableEndpointIdentification", "true");

        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, url);
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, "BSA");
        env.put(Context.SECURITY_CREDENTIALS, "Welcome!");

        try {
            DirContext ctx = new InitialDirContext(env);
            System.out.println("connected");
            System.out.println(ctx.getEnvironment());
            ctx.close();
        } catch (AuthenticationNotSupportedException ex) {
            System.out.println("The authentication is not supported by the server");
            ex.printStackTrace();
        } catch (AuthenticationException ex) {
            System.out.println("incorrect password or username");
            ex.printStackTrace();
        } catch (NamingException ex) {
            System.out.println("error when trying to create the context");
            ex.printStackTrace();
        }
    }
}