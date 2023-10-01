package Task;

public class Epic extends Task {

    private String[] subtraks;

    public Epic(int id, String[] subtraks) {
        super(id);
        this.subtraks = subtraks;
    }

    public String[] getSubtraks() {

        return subtraks;
    }

    public boolean matches(String query) {
        for (String subtrak : subtraks) {
            if (subtrak.contains(query)) {
                return true;
            }

        }
        return false;
    }
}


