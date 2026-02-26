package org.iesra.revilofe




class Pila<T>(private val elementos: MutableList<T> = mutableListOf()) : Iterable<T> {

    fun push(elemento: T) {
        elementos.add(elemento)
    }

    fun pop(): T {
        return elementos.removeAt(elementos.lastIndex)
    }

    fun peek(): T{
        return elementos.last()
    }

    fun isEmpty() : Boolean {
        if (elementos.size == 0) {
            return true
        } else {
            return false
        }
    }

    fun size() : Int {
        return elementos.size
    }



    override fun iterator() : Iterator<T>{

        fun hasNext(): Boolean {
            return elementos.isNotEmpty()
        }

        fun next() : T{

        }


    }

}