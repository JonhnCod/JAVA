package bean;

 

import java.util.ArrayList;

import java.util.List;

 

import javax.xml.bind.annotation.XmlAccessType;

import javax.xml.bind.annotation.XmlAccessorType;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

 

@XmlRootElement

@XmlAccessorType(XmlAccessType.FIELD)

public class ListaUF {

 

        @XmlElement(name = "uf" )

        private List<UF> ufs;
        
        public ListaUF() {
            this.ufs = new ArrayList<>(); // Garante inicialização
        }
        

        public List<UF> getUFs() {

                return ufs;

        }
        
        public void setUFs(List<UF> ufs) {
            this.ufs = ufs;
        }

 

}
