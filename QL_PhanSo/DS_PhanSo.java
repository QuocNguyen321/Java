import java.util.ArrayList;
public class DS_PhanSo {
    ArrayList <PhanSo> QLDS = new ArrayList<>();
    public DS_PhanSo(){}
    public void them_PS(PhanSo ps) {
        QLDS.add(ps);
    }
    public void xoa_PS(int k) {
        QLDS.remove(k - 1);
    }
    public void hienthi_DS() {
        for (int i = 0; i < QLDS.size(); i++) {
            if (i == QLDS.size() - 1) {
                System.out.println(QLDS.get(i).hienthi_PS());
            }
            else {
                System.out.print(QLDS.get(i).hienthi_PS() + " ");
            }
        }
    }
    public PhanSo Sum() {
        PhanSo sum = new PhanSo(QLDS.get(0));
        PhanSo result = new PhanSo();
        for (int i = 1; i < QLDS.size(); i++) {
            result = PhanSo.Add(sum, QLDS.get(i));
            sum = new PhanSo(result);
        }
        return result.rutgon_PS();
    }
    public void Sapxep_TangDan() {
        QLDS.sort( (PhanSo p1, PhanSo p2) -> {
            return PhanSo.SoSanh(p1, p2) == 1 ? 1 : (PhanSo.SoSanh(p1, p2) == 0 ? 0 : -1);
                }
        );
        System.out.print("DANH SACH PHAN SO TANG DAN:");
        hienthi_DS();
    }
}
