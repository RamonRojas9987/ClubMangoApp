package org.bedu.clubmangoapp.data

sealed class Category(val category: String) {
    object Bracelets: Category("Pulsos")
    object Rings: Category("Anillos")
    object Necklaces: Category("Collares")
    object Earrings: Category("Aretes")
    object Charms: Category("Dijes")
}