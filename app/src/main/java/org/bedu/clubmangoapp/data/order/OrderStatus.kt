package org.bedu.clubmangoapp.data.order

sealed class OrderStatus(val status: String) {
    object Ordered: OrderStatus("Orden Recibida")
    object Canceled: OrderStatus("Cancelado")
    object Confirmed: OrderStatus("Pedido Confirmado")
    object Shipped: OrderStatus("Enviado")
    object Delivered: OrderStatus("Entregado")
    object Returned: OrderStatus("Devuelto")
}

fun getOrderStatus(status: String): OrderStatus {
    return when (status) {
        "Orden Recibida" -> {
            OrderStatus.Ordered
        }
        "Cancelado" -> {
            OrderStatus.Canceled
        }
        "Pedido Confirmado" -> {
            OrderStatus.Confirmed
        }
        "Enviado" -> {
            OrderStatus.Shipped
        }
        "Entregado" -> {
            OrderStatus.Delivered
        }
        else -> OrderStatus.Returned
    }
}