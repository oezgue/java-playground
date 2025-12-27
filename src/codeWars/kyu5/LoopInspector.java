package codeWars.kyu5;


import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.Set;


public class LoopInspector {

    public int loopSize(Node node) {
        int countLoop = 0;
        Set<Node> set = new HashSet<>();
        Set<Node> loopSet = new HashSet<>();

        while ( !set.contains(node) ) {
            set.add(node);
            node = node.getNextSibling();
        }

        while (!loopSet.contains(node)) {
            countLoop++;
            loopSet.add(node);
            node = node.getNextSibling();
        }
        return countLoop;
    }

}
