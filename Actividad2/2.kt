// Clase que modela un producto con precio y descuento aplicable.

class Producto {
    private var precio: Double = 0.0
    private var descuento: Double = 0.0

    fun getPrecio(): Double {
        return precio
    }

    fun setPrecio(nuevoPrecio: Double) {
        if (nuevoPrecio >= 0) {
            precio = nuevoPrecio
        } else {
            println("El precio no puede ser negativo.")
        }
    }

    fun getDescuento(): Double {
        return descuento
    }

    fun setDescuento(nuevoDescuento: Double) {
        if (nuevoDescuento in 0.0..100.0) {
            descuento = nuevoDescuento
        } else {
            println("El descuento debe estar entre 0 y 100.")
        }
    }

    fun calcularPrecioFinal(): Double {
        return precio * (1 - descuento / 100)
    }
}

fun main() {
    val producto = Producto()
    producto.setPrecio(200.0)
    producto.setDescuento(10.0)
    println("Precio final: ${producto.calcularPrecioFinal()}")
}
