package com.example.userinterfaces;

//import java.lang.annotation.Target;


import org.openqa.selenium.devtools.v85.target.Target;

public class StoreLoginPage {

    public static Target USUARIO = Target.the("...")
}

public static final Target USUARIO_INPUT = Target.the("Usuario de Login").located(By.id("field-email"));
public static final Target PASS_INPUT = Target.the("Password de Login").located(By.id("field-password"));
public static final Target SUBMIT_INPUT =  Target.the("Boton Login").located(By.id("submit-login"));