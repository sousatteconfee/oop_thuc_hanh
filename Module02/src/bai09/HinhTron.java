package bai09;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
    }

    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return 2 * banKinh * 3.14;
    }

    public double tinhDienTich() {
        return banKinh * banKinh * 3.14;
    }

    public String toString() {
        String str1 = "Diện tích và chu vi hình tròn tâm";
        String str2 = "có bán Kính";
        return String.format("%s %s %s %5.2fm là %5.2fm và %5.2fm", str1, tam.toString(), str2, banKinh, tinhDienTich(),
                tinhChuVi());
   }
}
