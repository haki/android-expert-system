package md.meral.sialab1.presentation.util

class BinaryNode<T>(var value: T) {

    var parent:BinaryNode<T>? = null

    var children:MutableList<BinaryNode<T>> = mutableListOf()

    fun addChild(node:BinaryNode<T>){
        children.add(node)
        node.parent = this
    }
    override fun toString(): String {
        var s = "$value"
        if (!children.isEmpty()) {
            s += " {" + children.map { it.toString() } + " }"
        }
        return s
    }
}

object Node {
    var node: BinaryNode<String>? = null
}