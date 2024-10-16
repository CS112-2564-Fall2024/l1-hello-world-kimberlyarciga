public class Coffee {
    private String type;
    private int size;

    // Constructor
    public Coffee(String type, int size) {
        this.type = type;
        this.size = size;
    }

    // Getter
    public String getType() {
        return type;
    }

    // Setter
    public void setType(String type) {
        this.type = type;
    }

    // Getter
    public int getSize() {
        return size;
    }

    // Setter
    public void setSize(int size) {
        this.size = size;
    }

    
    // ToString
    public String toString() {
        return "Coffee {" +
                "Type = " + type + 
                ", Size = " + size +
                " Ounces}";
    }

    
    // Equals
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Coffee coffee = (Coffee) obj; 
        return size == coffee.size && type.equals(coffee.type); 
    }
}

