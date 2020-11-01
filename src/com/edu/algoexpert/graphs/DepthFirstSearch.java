package com.edu.algoexpert.graphs;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    static class Node {

        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            array.add(name);
            for (Node node : children) {
                node.depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
