package org.bedu.clubmangoapp.util

import android.util.Patterns

fun validateEmail(email: String): RegisterValidation{
    if (email.isEmpty())
        return RegisterValidation.Failed("Correo electrónico no puede estar vacío ")

    if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        return RegisterValidation.Failed("Formato de correo electrónico incorrecto")

    return RegisterValidation.Success
}

fun validatePassword(password: String): RegisterValidation{
    if (password.isEmpty())
        return RegisterValidation.Failed("Contraseña no puede estar vacío")

    if (password.length < 8)
        return RegisterValidation.Failed("Contraseña debe contener al menos 8 caracteres ")

    return RegisterValidation.Success
}