package model;

import java.util.Objects;

public class ContactMessage {
    private String fullName;
    private String gender;
    private String category;
    private String message;

    public ContactMessage(String fullName, String gender, String category, String message) {
        this.fullName = fullName;
        this.gender = gender;
        this.category = category;
        this.message = message;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getCategory() {
        return category;
    }

    public String getMessage() {
        return message;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ContactMessage{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", category='" + category + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactMessage that = (ContactMessage) o;
        return Objects.equals(fullName, that.fullName) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(category, that.category) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, gender, category, message);
    }
}
