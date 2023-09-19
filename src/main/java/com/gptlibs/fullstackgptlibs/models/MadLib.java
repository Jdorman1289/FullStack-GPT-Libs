package com.gptlibs.fullstackgptlibs.models;

import com.gptlibs.fullstackgptlibs.controllers.GptLibs;

import java.util.ArrayList;

public class MadLib {
    private String story;
    private ArrayList<String> savedStories;
    private String adj;
    private String noun;
    private String adv;
    private String verb;

    public MadLib() {
        this.savedStories = new ArrayList<String>();
    }

    public String getStory() {
        return story;
    }

    public void setStory() {
        this.story = GptLibs.genStory(this.noun, this.verb, this.adj, this.adv);
    }

    public void setAdj(String adj) {
        this.adj = adj;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public void setAdv(String adv) {
        this.adv = adv;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public ArrayList<String> getSavedStories() {
        return savedStories;
    }

    public void setSavedStories(String newStory) {
        this.savedStories.add(newStory);
    }

}
