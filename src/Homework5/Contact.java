package Homework5;

import lombok.Builder;

import java.util.Objects;

class Contact {
    private int id;
    private String name;
    private Company company;
    private String email;
    private String phone;
    private Department department;
    private Contact(int id, String name, Company company, String email, String phone, Department department) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }



    @Override
    public int hashCode() {
        return Objects.hash(id, name, company, email, phone, department);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {return name;}
    public Company getCompany() {return company;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    public Department getDepartment() {return department;}

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (name != null) stringBuilder.append("Name ").append(name);
        if (company != null) stringBuilder.append(" company: ").append(company);
        if (email != null) stringBuilder.append(" email: ").append(email);
        if (phone != null) stringBuilder.append(" phone: ").append(phone);
        if (department != null) stringBuilder.append(" department: ").append(department);

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id &&
                Objects.equals(name, contact.name) &&
                company == contact.company &&
                Objects.equals(email, contact.email) &&
                Objects.equals(phone, contact.phone) &&
                department == contact.department;
    }

    static class Builder {
        private int id;
        private String name;
        private Company company;
        private String email;
        private String phone;
        private Department department;

        Builder() {}

        Builder setId(int id) {
            this.id = id;
            return this;
        }
        Builder setName(String name) {
            this.name = name;
            return this;
        }
        Builder setCompany(Company company) {
            this.company = company;
            return this;
        }
        Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        Builder setDepartment(Department department) {
            this.department = department;
            return this;
        }

        Contact build() {
            return new Contact(id, name, company, email, phone, department);
        }
    }
}
