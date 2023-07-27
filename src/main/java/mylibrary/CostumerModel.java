package mylibrary;

public class CostumerModel {
    private int document_id;
    private String doc_type;
    private String name;
    private String last_name;
    private String email;
    private String program;

    public CostumerModel() {
    }

    public CostumerModel(int document_id, String doc_type, String name, String last_name, String email, String program) {
        this.document_id = document_id;
        this.doc_type = doc_type;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.program = program;
    }

    public int getDocument_id() {
        return document_id;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
    }

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }


}
