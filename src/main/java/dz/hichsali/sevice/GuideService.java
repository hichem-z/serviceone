package dz.hichsali.sevice;

import dz.hichsali.model.Guide;

import java.util.List;

public interface GuideService {

    public void addGuide(Guide guide);
    public List<Guide> getGuides();

}
