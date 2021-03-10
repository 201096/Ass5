
package controllers;
        import entities.Company;
        import storages.interfaces.ICompanyStorage;



public class Manager {
    private final ICompanyStorage icompanyStorage;

    public Manager(ICompanyStorage companyStorage) {
        this.icompanyStorage = companyStorage;
    }

    public String searchCompanyByName(String name) {
        String result = icompanyStorage.searchCompanyByName(name).toString();

        return result;
    }

    public String getCompanyById(int id) {
        String result = icompanyStorage.getCompanyById(id).toString();

        return result;
    }

    public String addEmployee(String name, double price, String specialization, String surname, String email ) {

        boolean added = icompanyStorage.addCompany(new Company(name, price,specialization,surname,email));

        if (added) {
            return "Employee was added!";
        }

        return "Employee was not added!";
    }

    public String removeCompanyById(int id) {
        boolean removed = icompanyStorage.removeCompanyById(id);

        if (removed) {
            return "Employee was removed!";
        }

        return "Employee was not removed!";
    }
}
