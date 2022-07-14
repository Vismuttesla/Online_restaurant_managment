package entities;

public class Table {
	private int id;
    private int number;
    private String facilities;
    private TableType type;
    private boolean available;
    private String description;
//    Attachment picture;

    public Table(){}

    public Table(int number, String facilities, TableType type, boolean available) {
        this.number = number;
        this.facilities = facilities;
        this.type = type;
        this.available = available;
    }

    public Table(int number, String facilities, TableType type, boolean available, String description) {
        this.number = number;
        this.facilities = facilities;
        this.type = type;
        this.available = available;
        this.description = description;
    }

    public int getId() {
    	return this.id;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public TableType getType() {
        return type;
    }

    public void setType(TableType type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Table{" +
        		"id='" + id + '\'' +
        		", number=" + number +
                ", facilities='" + facilities + '\'' +
                ", type=" + type +
                ", available=" + available +
                ", description='" + description + '\'' +
                '}';
    }
}
