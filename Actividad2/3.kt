abstract class Shape {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double

    fun imprimirResultados() {
        println("Área: ${calcularArea()}")
        println("Perímetro: ${calcularPerimetro()}")
    }
}

class Cuadrado(val lado: Double) : Shape() {
    override fun calcularArea(): Double = lado * lado
    override fun calcularPerimetro(): Double = 4 * lado
}

class Circulo(val radio: Double) : Shape() {
    override fun calcularArea(): Double = Math.PI * radio * radio
    override fun calcularPerimetro(): Double = 2 * Math.PI * radio
}

class Rectangulo(val largo: Double, val ancho: Double) : Shape() {
    override fun calcularArea(): Double = largo * ancho
    override fun calcularPerimetro(): Double = 2 * (largo + ancho)
}

fun main() {
    val cuadrado = Cuadrado(4.0)
    cuadrado.imprimirResultados()

    val circulo = Circulo(3.0)
    circulo.imprimirResultados()

    val rectangulo = Rectangulo(5.0, 2.0)
    rectangulo.imprimirResultados()
}