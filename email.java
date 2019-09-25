package testQuestion.test;

public class User {
    private String name;
    private String companyName;
    private int yearOfJoining;
    private String createUserEmail;
    private String createUserpassword;

    public String getCreateUserEmail() {
        return createUserEmail;
    }

    public String getCreateUserpassword() {
        return createUserpassword;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public User(String name, String companyName, int yearOfJoining) {
        this.name = name;
        this.companyName = companyName;
        this.yearOfJoining = yearOfJoining;
        this.createUserEmail = createUseremail();
        this.createUserpassword = createUserPassword();
    }

    private String createUseremail() {
        return createUserEmail();
    }

    private String createUserEmail() {
        return createUserEmail();
    }


    private String cretaeUSeremail () {
            return String.format(("%s_%d@%s.com"), getName().toLowerCase(), getCompanyName().toLowerCase());

        }
        private String createUserPassword () {
            StringBuilder sb = new StringBuilder();
            sb.append(generaterandomCharacter());
            for (int i = 0; i < 4; i++) {
                sb.append(generateRandmIntegerFormLimit(10));
            }
            sb.append(getFirst5CharactersFormUserName());
            sb.append(generateRandomSpecialSymbol());
            return sb.toString();


        }
        private String getFirst5CharactersFormUserName () {
            if (getName().length() < 5){
                int difference = 5 - getName().length();
                StringBuilder tempName = new StringBuilder(getName());
                for (int i = 0; i < difference; i++) {
                    tempName.append("0");
                }
                return tempName.toString();
            } else {
                return getName().substring(0, 5);
            }
        }
        private char generaterandomCharacter () {
            int randomNumberUpto26 = generateRandmIntegerFormLimit(26);
            return (char) ('a' + randomNumberUpto26);

        }

        public int generateRandmIntegerFormLimit ( int limit){
            return (int) (Math.random() * limit);
        }
        private char generateRandomSpecialSymbol () {
            char[] specialSymbols =
                    {
                            '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}', '[', ']', '|', '\\', ';', ':', '\'', '\"', '<', '>', ',', '.', '/', '?'
                    };
            int randomInteger = generateRandmIntegerFormLimit(specialSymbols.length);
            return specialSymbols[randomInteger];

        }
    }

    class Userentry{
        public static void main(String[] args) {
            User obj = new User("anuj", "microsoft", 2022);
            System.out.println(obj.getCreateUserEmail());
            System.out.println(obj.getCreateUserpassword());
        }
    }
