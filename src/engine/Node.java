package engine;

import java.util.UUID;

public class Node {
    private String hashId = ""; //unique id for our node
    private String label = ""; // a label for the node, hardcoded to a string for now, this can be variable
    private String properties = ""; // a property/data for the node, again hardcoded as string and will change in future

    /*Static constructors*/
    public Node(){
        this.hashId = UUID.randomUUID().toString();
    }

    public static Node createWithHashId(String hashId) {
        Node newNode =  new Node();
        newNode.hashId = hashId;
        return newNode;
    }

    public static Node createWithLabel(String label){
        Node newNode = new Node();
        newNode.setLabel(label);
        return newNode;
    }

    public static Node createWithLabelandProperties(String label, String properties){
        Node newNode = new Node();
        newNode.setLabel(label);
        newNode.setProperties(properties);
        return newNode;
    }

    /*Constructors*/
    public Node(String label) {
        this.label = label;
        this.hashId = UUID.randomUUID().toString();
    }

    public Node(String label, String properties){
        this.label = label;
        this.properties = properties;
        this.hashId = UUID.randomUUID().toString();
    }

    public Node(String label, String properties, String hashId){
        this.label = label;
        this.properties = properties;
        this.hashId = hashId;
    }

    public String getLabel() {
        return label;
    }

    public String getHashId() {
        return hashId;
    }

    public String getProperties() {
        return properties;
    }

    public void setHashId(String hashId){
        this.hashId = hashId;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public void setProperties(String properties){
        this.properties = properties;
    }

    public void updateLabel(String label) {
        this.label = label;
    }

    public void updateProperties(String properties) {
        this.properties = properties;
    }

}//end of Node class
