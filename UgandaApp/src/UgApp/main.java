package UgApp;

import TaxCollection.tax;
import PassportProcessing.passport;
import NationalIdentity.identity;
import BusinessRegistration.registration;
public class main {
    static void main(String[] args) {
        tax tx = new tax();
        passport pst= new passport("Edgard", "12 jun 2004",
                "Mary");
        identity id = new identity();
        registration reg = new registration("Olivier Resto",
                "we are giving you good food with more quality");

        System.out.println("===== Tax Collection=====");
        tx.TaxCollected("Anas", 200);
        System.out.println("=====Passport Processing=====");
        pst.PassportProcess();
        System.out.println("=====National Identification Management=====");
        id.IdentityInfo("DS454586AE","Hamza");
        System.out.println("=====Business Registration=====");
        reg.BusinessInfo();
    }
}
