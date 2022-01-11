public class NgayThang {
    private int day, month, year, dinhdang;
    public NgayThang() {
        this.day = this.month = 1;
        this.year = 1900;
        this.dinhdang = 0;
    }
    public boolean isyear(int year) {
        if (year < 1900 || year > 2100) { return false; }
        return true;
    }
    public boolean ismonth(int month) {
        if (month < 1 || month > 12) { return false; }
        return true;
    }
    public boolean isnamnhuan(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) { return true; }
        return false;
    }
    public int sumday(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: { return 31; }
            case 2: {
                if (isnamnhuan(year) == true) { return 29; }
                return 28;
            }
            default: { return 30; }
        }
    }
    public boolean isday(int day, int month, int year) {
        if (day < 1 || day > sumday(month, year)) { return  false; }
        return true;
    }
    public NgayThang(int day, int month, int year) {
        if (isday(day, month, year) == false || ismonth(month) == false || isyear(year) == false) {
            this.day = this.month = 1;
            this.year = 1900;
        }
        else {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        this.dinhdang = 0;
    }
    public NgayThang(NgayThang n) {
        this.day = n.day;
        this.month = n.month;
        this.year = n.year;
        this.dinhdang = n.dinhdang;
    }
    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }
    public int getDay() { return this.day; }
    public int getMonth() { return this.month; }
    public int getYear() { return this.year; }
    public void doidinhdang(int dinhdang) {
        if (dinhdang < 0 && dinhdang > 2) { this.dinhdang = 0; }
        else { this.dinhdang = dinhdang; }
    }
    public int dayinweek() {
        int a = (14 - this.month) / 12;
        int y = this.year - a;
        int m = this.month + 12 * a - 2;
        int sum = (this.day + y + y /4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        switch (sum) {
            case 0: { return 1; }
            case 1: { return 2; }
            case 2: { return 3; }
            case 3: { return 4; }
            case 4: { return 5; }
            case 5: { return 6; }
            default: { return 7; }
        }
    }
    public String thutrongtuan() {
        if (this.dinhdang == 0) {
            switch (dayinweek()) {
                case 1: {
                    return "Chu Nhat";
                }
                case 2: {
                    return "Thu Hai";
                }
                case 3: {
                    return "Thu Ba";
                }
                case 4: {
                    return "Thu Tu";
                }
                case 5: {
                    return "Thu Nam";
                }
                case 6: {
                    return "Thu Sau";
                }
                default: {
                    return "Thu Bay";
                }
            }
        } else {
            switch (dayinweek()) {
                case 1: {
                    return "Sun";
                }
                case 2: {
                    return "Mon";
                }
                case 3: {
                    return "Tue";
                }
                case 4: {
                    return "Wed";
                }
                case 5: {
                    return "Thu";
                }
                case 6: {
                    return "Fri";
                }
                default: {
                    return "Sat";
                }
            }
        }
    }
    public String toString() {
        if (this.dinhdang == 0) { return this.day + "/" + this.month + "/" + this.year; }
        else if (this.dinhdang == 1) { return this.month + "/" + this.day + "/" + this.year; }
        else { return this.year + "." + this.month + "." + this.day; }
    }
}
