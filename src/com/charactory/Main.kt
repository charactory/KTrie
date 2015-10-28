package com.charactory


public object Main {
    @JvmStatic public fun main(args: Array<String>) {

        val testTrie = Trie()
        testTrie.addWord("blade")
        testTrie.addWord("god")
        testTrie.addWord("bath")
        testTrie.addWord("bad")

        testTrie.addWord("gode")

        testTrie.addWord("bade")

        printNodes(testTrie.root)

    }

    public fun printNodes(node : Trie.Node) {
        var children = "Parent node: ${node.letter}, children: "



//        println("Parent node: ${node.letter}")
        for (n in node.nextNodes) {
//            println(n.letter)
            children += n.letter
            children += ", "
            println(children)
            printNodes(n)
        }
    }
}