package mvcMysql;

/**
 *
 * @author ABDAN SM
 */
public class ControllerMovie extends ModelMovie implements InterController {
    
    @Override
    public void olahNilai(){
    nilai = (alur+penokohan+akting)/3.0;
    
    }
}
