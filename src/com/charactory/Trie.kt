package com.charactory

import java.util.*


public class Trie {

    public class Node(val letter: String) {
        val nextNodes: ArrayList<Node> = ArrayList<Node>()
        var isWord : Boolean = false

        public fun getNext(letter: String): Node {
            for (n in nextNodes) {
                if (n.letter.equals(letter)) {
                    return n
                }
            }
            //make a new node if it doesn't already exist
            val newNode = Node(letter)
            nextNodes.add(newNode)
            return newNode
        }

        public fun setToWordNode() {
            isWord = true
        }
    }


    val root = Node(" ")


    public fun addWord(word: String) {
        var node: Node = root
        for (s in word) {
            val letter = s.toString()
            node = node.getNext(letter)
        }
        val lastNode = node.getNext(word)

    }

}