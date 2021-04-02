package dz.hichsali.sevice;

import dz.hichsali.model.Banque;

import java.util.Collection;

public interface BanqueSevice {
public Collection<Banque> getBanques();
public Banque getBanque(String id);
}
