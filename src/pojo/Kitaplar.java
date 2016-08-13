package pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import connection.Connect;

public class Kitaplar 
{
	private Connection con1;
	
	
	ResultSet set;
	Statement stmt;
	Connect baglanti=new Connect();
	int sutunSayisi=0;
	
	
	private Integer id;
	private String kitapAdi;
	private String kitapYazari;
	private String ISBN;
	private String kitapTuru;
	private String basimEvi;
	private String basimYili;
	private String mensei;
	private String kagitTipi;
	private Float kitapFiyati;
	private String kalite;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getKitapYazari() {
		return kitapYazari;
	}
	public void setKitapYazari(String kitapYazari) {
		this.kitapYazari = kitapYazari;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getKitapTuru() {
		return kitapTuru;
	}
	public void setKitapTuru(String kitapTuru) {
		this.kitapTuru = kitapTuru;
	}
	public String getBasimEvi() {
		return basimEvi;
	}
	public void setBasimEvi(String basimEvi) {
		this.basimEvi = basimEvi;
	}
	public String getBasimYili() {
		return basimYili;
	}
	public void setBasimYili(String basimYili) {
		this.basimYili = basimYili;
	}
	public String getMensei() {
		return mensei;
	}
	public void setMensei(String mensei) {
		this.mensei = mensei;
	}
	public String getKagitTipi() {
		return kagitTipi;
	}
	public void setKagitTipi(String kagitTipi) {
		this.kagitTipi = kagitTipi;
	}
	public Float getKitapFiyati() {
		return kitapFiyati;
	}
	public void setKitapFiyati(Float kitapFiyati) {
		this.kitapFiyati = kitapFiyati;
	}
	public String getKalite() {
		return kalite;
	}
	public void setKalite(String kalite) {
		this.kalite = kalite;
	}
	
	
	public Kitaplar()
	{
	    con1= baglanti.baglantiOlustur();
	}
	public void insert() throws SQLException
	{
		PreparedStatement pres = null;
		
		String SQL = "INSERT INTO KITAPLISTESI(KITAPADI,KITAPYAZARI,ISBN,BASIMYILI,BASIMEVI,KALITE,KITAPTURU,MENSEI,KAGITTIPI,FIYAT) " + "VALUES(?,?,?,?,?,?,?,?,?,?)";
		pres = this.con1.prepareStatement(SQL);
		
		pres.setNString(1, this.getKitapAdi());
		pres.setNString(2, getKitapYazari());
		pres.setNString(3, this.getISBN());
		pres.setNString(4, this.getBasimYili());
		pres.setNString(5, this.getBasimEvi());
		pres.setNString(6, this.getKalite());
		pres.setNString(7, this.getKitapTuru());
		pres.setNString(8, this.getMensei());
		pres.setNString(9, this.getKagitTipi());
		pres.setFloat(10, this.getKitapFiyati());
		
		
		pres.executeUpdate();
		
	}
	public DefaultTableModel listele() throws SQLException
    {
    	baglanti.baglantiOlustur();
    	stmt=baglanti.con.createStatement();
    	String query="Select ID,BASIMEVI,KITAPADI,ISBN,FIYAT from KITAPLISTESI";
    	
    	set=stmt.executeQuery(query);
    	sutunSayisi=set.getMetaData().getColumnCount();
    	 DefaultTableModel table1=new DefaultTableModel();
    	
    	 for(int i=1;i<=sutunSayisi;i++)
            table1.addColumn(set.getMetaData().getColumnName(i));
    	 while(set.next()){
             Object[] row=new Object[sutunSayisi];
              for(int i=1;i<=sutunSayisi;i++)
              {
            	  row[i-1]=set.getObject(i);
            	  System.out.println(set.getObject(i));
              }
                
             table1.addRow(row);
             
        }
    	 return table1;
    	 
    	 
    	 
    }
	
	
	 
	
	
	
	

	

}
