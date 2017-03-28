package edu.example.NeuralNetwork;

import java.util.ArrayList;

/**
 * Created by Jarod on 28.03.2017.
 */
public class Network {
    private ArrayList<Node> nodes;
    public Node getNode(int index){
        return nodes.get(index);
    }
    public int getSize(){
        return nodes.size();
    }
}

