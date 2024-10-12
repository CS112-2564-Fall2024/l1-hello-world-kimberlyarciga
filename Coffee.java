public class Coffee {
    private String type;
    private int size;

    
    public Coffee(String type, int size) {
        this.type = type;
        this.size = size;
    }

    
    public String getType() {
        return type;
    }

    
    public void setType(String type) {
        this.type = type;
    }

    
    public int getSize() {
        return size;
    }

    
    public void setSize(int size) {
        this.size = size;
    }

    
    
    public String toString() {
        return "Coffee {" +
                "Type = " + type + 
                ", Size = " + size +
                " Ounces}";
    }

    
    
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Coffee coffee = (Coffee) obj; 
        return size == coffee.size && type.equals(coffee.type); 
    }
}

