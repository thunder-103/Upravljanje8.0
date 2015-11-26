package superime.prodajavozila;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Ponuda")
public class Ponuda implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("PonudaID")
   private java.lang.Long ponudaID;
   @org.kie.api.definition.type.Label("KupacID")
   private Kupac kupacID;

   @org.kie.api.definition.type.Label("VoziloID")
   private superime.prodajavozila.Vozilo voziloID;

   @org.kie.api.definition.type.Label("NarudzbaVozila")
   private Narudzba narudzba_vozila;

   @org.kie.api.definition.type.Label("DojmoviID")
   private superime.prodajavozila.Dojmovi dojmovi_id;

   @org.kie.api.definition.type.Label("TrasakcijaID")
   private superime.prodajavozila.Transakcija transakcija_id;

   @org.kie.api.definition.type.Label(value = "PonovniKontaktID")
   private superime.prodajavozila.PonovniKontakt ponovniKontakt_id;

   public Ponuda()
   {
   }

   public java.lang.Long getPonudaID()
   {
      return this.ponudaID;
   }

   public void setPonudaID(java.lang.Long ponudaID)
   {
      this.ponudaID = ponudaID;
   }

   public superime.prodajavozila.Vozilo getVoziloID()
   {
      return this.voziloID;
   }

   public void setVoziloID(superime.prodajavozila.Vozilo voziloID)
   {
      this.voziloID = voziloID;
   }

   public superime.prodajavozila.Kupac getKupacID()
   {
      return this.kupacID;
   }

   public void setKupacID(superime.prodajavozila.Kupac kupacID)
   {
      this.kupacID = kupacID;
   }

   public superime.prodajavozila.Narudzba getNarudzba_vozila()
   {
      return this.narudzba_vozila;
   }

   public void setNarudzba_vozila(superime.prodajavozila.Narudzba narudzba_vozila)
   {
      this.narudzba_vozila = narudzba_vozila;
   }

   public superime.prodajavozila.Dojmovi getDojmovi_id()
   {
      return this.dojmovi_id;
   }

   public void setDojmovi_id(superime.prodajavozila.Dojmovi dojmovi_id)
   {
      this.dojmovi_id = dojmovi_id;
   }

   public superime.prodajavozila.Transakcija getTransakcija_id()
   {
      return this.transakcija_id;
   }

   public void setTransakcija_id(superime.prodajavozila.Transakcija transakcija_id)
   {
      this.transakcija_id = transakcija_id;
   }

   public superime.prodajavozila.PonovniKontakt getPonovniKontakt_id()
   {
      return this.ponovniKontakt_id;
   }

   public void setPonovniKontakt_id(
         superime.prodajavozila.PonovniKontakt ponovniKontakt_id)
   {
      this.ponovniKontakt_id = ponovniKontakt_id;
   }

   public Ponuda(java.lang.Long ponudaID, superime.prodajavozila.Kupac kupacID,
         superime.prodajavozila.Vozilo voziloID,
         superime.prodajavozila.Narudzba narudzba_vozila,
         superime.prodajavozila.Dojmovi dojmovi_id,
         superime.prodajavozila.Transakcija transakcija_id,
         superime.prodajavozila.PonovniKontakt ponovniKontakt_id)
   {
      this.ponudaID = ponudaID;
      this.kupacID = kupacID;
      this.voziloID = voziloID;
      this.narudzba_vozila = narudzba_vozila;
      this.dojmovi_id = dojmovi_id;
      this.transakcija_id = transakcija_id;
      this.ponovniKontakt_id = ponovniKontakt_id;
   }

}