package edu.example.NeuralNetwork;

import java.util.ArrayList;

/**
 * Created by Jarod on 28.03.2017.
 */
public class Node{
        public Network net;
        public int index;
        protected ArrayList<double> wheights;

    public Node(Network net,int index){
        this.net = net;
        this.index = index;
    }
    public void input(Node source, double in){
        double out = activityFunction(in);
        int size = net.getSize();
        for(int i = 0;i < index;i++){
            net.getNode(i).input(this,calculateOutput(i,out));
        }
        for(int i = index+1;i < size;i++){
            net.getNode(i).input(this,calculateOutput(i,out));
        }
    }
    protected double calculateOutput(int outputIndex,double rawOutput){
        return wheights.get(outputIndex)*rawOutput;
    }
    protected double getWheights(int outputIndex){
        return wheights.get(outputIndex);
    }
    protected final double activityFunction(double rawOutput){
        return rawOutput;
    }
    public void stimulate(Node source,double in){

    }

}
