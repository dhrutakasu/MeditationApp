package com.sound.meditionsoundapp.ui.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sound.meditionsoundapp.Model.ItemModel;
import com.sound.meditionsoundapp.R;
import com.sound.meditionsoundapp.ui.Adapter.SoundsAdapter;
import com.sound.meditionsoundapp.utils.Constants;

import java.util.ArrayList;

public class SoundPlayerActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context;
    private ImageView IvBack, IvItemImg, IvPlaySound;
    private TextView TvTitle;
    private String StrItemName;
    private int IntItemIcon;
    private MediaPlayer PlayerSound;
    private int ItemId;
    private RecyclerView RvSound;
    private ArrayList<ItemModel> modelArrayList;
    private SoundsAdapter soundAdapter;
    private MediaPlayer PlayerLightRain;
    private MediaPlayer PlayerHeavyRain;
    private MediaPlayer PlayerThunder;
    private MediaPlayer PlayerRainOnUmbrella;
    private MediaPlayer PlayerRainOnWindow;
    private MediaPlayer PlayerSnow;
    private MediaPlayer PlayerRainOnRoof;
    private MediaPlayer PlayerRainOnTent;
    private MediaPlayer PlayerRainOnPuddle;
    private MediaPlayer PlayerWind;
    private MediaPlayer PlayerWindLeaves;
    private MediaPlayer PlayerDripping;
    private MediaPlayer PlayerBird;
    private MediaPlayer PlayerBirds;
    private MediaPlayer PlayerSeagull;
    private MediaPlayer PlayerFrog;
    private MediaPlayer PlayerFroggs;
    private MediaPlayer PlayerCricket;
    private MediaPlayer PlayerCicada;
    private MediaPlayer PlayerWolf;
    private MediaPlayer PlayerLoon;
    private MediaPlayer PlayerCatPurring;
    private MediaPlayer PlayerWhale;
    private MediaPlayer PlayerOwl;
    private MediaPlayer PlayerCar;
    private MediaPlayer PlayerCrowd;
    private MediaPlayer PlayerHeartbeat;
    private MediaPlayer PlayerConstructionSite;
    private MediaPlayer PlayerSleepTight;
    private MediaPlayer PlayerDryer;
    private MediaPlayer PlayerHairDryer;
    private MediaPlayer PlayerVacuumCleaner;
    private MediaPlayer PlayerFan;
    private MediaPlayer PlayerClock;
    private MediaPlayer PlayerKeyboard;
    private MediaPlayer PlayerWiper;
    private MediaPlayer PlayerCarsPassing;
    private MediaPlayer PlayerWindChime;
    private MediaPlayer PlayerMeditationBell;
    private MediaPlayer PlayerViolin;
    private MediaPlayer PlayerHarp;
    private MediaPlayer PlayerGuzheng;
    private MediaPlayer PlayerWhiteNoise;
    private MediaPlayer PlayerBrownNoise;
    private MediaPlayer PlayerPinkNoise;
    private MediaPlayer PlayerGuitar;
    private MediaPlayer PlayerPiano;
    private MediaPlayer PlayerFlute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_player);

        initViews();
        initIntents();
        initListeners();
        initActions();
    }

    private void initViews() {
        context = this;
        IvBack = (ImageView) findViewById(R.id.IvBack);
        TvTitle = (TextView) findViewById(R.id.TvTitle);
        IvItemImg = (ImageView) findViewById(R.id.IvItemImg);
        IvPlaySound = (ImageView) findViewById(R.id.IvPlaySound);
        RvSound = (RecyclerView) findViewById(R.id.RvSound);
    }

    private void initIntents() {
        StrItemName = getIntent().getStringExtra(Constants.ItemName);
        IntItemIcon = getIntent().getIntExtra(Constants.ItemIcon, -1);
    }

    private void initListeners() {
        IvBack.setOnClickListener(this);
        IvPlaySound.setOnClickListener(this);
    }

    private void initActions() {
        TvTitle.setText(getString(R.string.now_playing));

        if (IntItemIcon != -1) {
            IvItemImg.setImageResource(IntItemIcon);
        }
        String s = StrItemName.toLowerCase().replace(" ", "");
        ItemId = getResources().getIdentifier(StrItemName.toLowerCase().replace(" ", ""), "raw", getPackageName());
//        RvSound.setLayoutManager(new GridLayoutManager(context, 3));
        RvSound.setLayoutManager(new LinearLayoutManager(context));
        PlayerSound = MediaPlayer.create(context, ItemId);

        GotoAddSounds();
    }

    private void GotoAddSounds() {
        modelArrayList = new ArrayList<>();
        modelArrayList.add(new ItemModel(getString(R.string.ligth_rain), R.drawable.ic_rain, 0));
        modelArrayList.add(new ItemModel(getString(R.string.heavy_rain), R.drawable.ic_heavy_rain, 0));
        modelArrayList.add(new ItemModel(getString(R.string.thunder), R.drawable.ic_thunder, 0));
        modelArrayList.add(new ItemModel(getString(R.string.rain_on_umbrella), R.drawable.ic_rain_on_umbrella, 0));
        modelArrayList.add(new ItemModel(getString(R.string.rain_on_window), R.drawable.ic_rain_on_window, 0));
        modelArrayList.add(new ItemModel(getString(R.string.snow), R.drawable.ic_snow, 0));
        modelArrayList.add(new ItemModel(getString(R.string.rain_on_roof), R.drawable.ic_rain_on_roof, 0));
        modelArrayList.add(new ItemModel(getString(R.string.rain_on_tent), R.drawable.ic_rain_on_tent, 0));
        modelArrayList.add(new ItemModel(getString(R.string.rain_on_puddle), R.drawable.ic_rain_on_puddle, 0));
        modelArrayList.add(new ItemModel(getString(R.string.wind_leaves), R.drawable.ic_wind_leaves, 0));
        modelArrayList.add(new ItemModel(getString(R.string.wind), R.drawable.ic_wind, 0));
        modelArrayList.add(new ItemModel(getString(R.string.drip), R.drawable.ic_dripping, 0));
        modelArrayList.add(new ItemModel(getString(R.string.bird), R.drawable.ic_bird, 0));
        modelArrayList.add(new ItemModel(getString(R.string.birds), R.drawable.ic_bird2, 0));
        modelArrayList.add(new ItemModel(getString(R.string.seagull), R.drawable.ic_seagull, 0));
        modelArrayList.add(new ItemModel(getString(R.string.frog), R.drawable.ic_frog, 0));
        modelArrayList.add(new ItemModel(getString(R.string.froggs), R.drawable.ic_frog2, 0));
        modelArrayList.add(new ItemModel(getString(R.string.cricket), R.drawable.ic_cricket, 0));
        modelArrayList.add(new ItemModel(getString(R.string.cicada), R.drawable.ic_cicada, 0));
        modelArrayList.add(new ItemModel(getString(R.string.wolf), R.drawable.ic_wolf, 0));
        modelArrayList.add(new ItemModel(getString(R.string.loon), R.drawable.ic_loon, 0));
        modelArrayList.add(new ItemModel(getString(R.string.cat_purruing), R.drawable.ic_cat_purring, 0));
        modelArrayList.add(new ItemModel(getString(R.string.whale), R.drawable.ic_whale, 0));
        modelArrayList.add(new ItemModel(getString(R.string.owl), R.drawable.ic_owl, 0));
        modelArrayList.add(new ItemModel(getString(R.string.car), R.drawable.ic_car, 0));
        modelArrayList.add(new ItemModel(getString(R.string.crowd), R.drawable.ic_crowd, 0));
        modelArrayList.add(new ItemModel(getString(R.string.heartbeat), R.drawable.ic_heartbeat, 0));
        modelArrayList.add(new ItemModel(getString(R.string.construction_site), R.drawable.ic_construction_site, 0));
        modelArrayList.add(new ItemModel(getString(R.string.lullaby), R.drawable.ic_lullaby, 0));
        modelArrayList.add(new ItemModel(getString(R.string.dryer), R.drawable.ic_dryer, 0));
        modelArrayList.add(new ItemModel(getString(R.string.hair_dryer), R.drawable.ic_hair_dryer, 0));
        modelArrayList.add(new ItemModel(getString(R.string.vacuum_cleaner), R.drawable.ic_vacuum_cleaner, 0));
        modelArrayList.add(new ItemModel(getString(R.string.fan), R.drawable.ic_fan, 0));
        modelArrayList.add(new ItemModel(getString(R.string.clock), R.drawable.ic_clock, 0));
        modelArrayList.add(new ItemModel(getString(R.string.keyboard), R.drawable.ic_keyboard, 0));
        modelArrayList.add(new ItemModel(getString(R.string.wiper), R.drawable.ic_wiper, 0));
        modelArrayList.add(new ItemModel(getString(R.string.cars_passing), R.drawable.ic_passing_car, 0));
        modelArrayList.add(new ItemModel(getString(R.string.wind_chime), R.drawable.ic_wind_chime, 0));
        modelArrayList.add(new ItemModel(getString(R.string.meditation_bell), R.drawable.ic_meditation_bell, 0));
        modelArrayList.add(new ItemModel(getString(R.string.violin), R.drawable.ic_violin, 0));
        modelArrayList.add(new ItemModel(getString(R.string.harp), R.drawable.ic_harp, 0));
        modelArrayList.add(new ItemModel(getString(R.string.guzheng), R.drawable.ic_guzheng, 0));
        modelArrayList.add(new ItemModel(getString(R.string.white_noise), R.drawable.ic_white_noise, 0));
        modelArrayList.add(new ItemModel(getString(R.string.brown_noise), R.drawable.ic_brown_noise, 0));
        modelArrayList.add(new ItemModel(getString(R.string.pink_noise), R.drawable.ic_pink_noise, 0));
        modelArrayList.add(new ItemModel(getString(R.string.guitar), R.drawable.ic_guitar, 0));
        modelArrayList.add(new ItemModel(getString(R.string.piano), R.drawable.ic_piano, 0));
        modelArrayList.add(new ItemModel(getString(R.string.flute), R.drawable.ic_flute, 0));
        System.out.println("********** size : " + modelArrayList.size());

        PlayerLightRain = MediaPlayer.create(context, R.raw.nature_rain);
        PlayerLightRain.setLooping(true);
        PlayerHeavyRain = MediaPlayer.create(context, R.raw.nature_heavy_rain);
        PlayerHeavyRain.setLooping(true);
        PlayerThunder = MediaPlayer.create(context, R.raw.nature_thunder);
        PlayerThunder.setLooping(true);
        PlayerRainOnUmbrella = MediaPlayer.create(context, R.raw.rain_on_umbrella);
        PlayerRainOnUmbrella.setLooping(true);
        PlayerRainOnWindow = MediaPlayer.create(context, R.raw.rain_on_window);
        PlayerRainOnWindow.setLooping(true);
        PlayerSnow = MediaPlayer.create(context, R.raw.snow);
        PlayerSnow.setLooping(true);
        PlayerRainOnRoof = MediaPlayer.create(context, R.raw.rain_on_roof);
        PlayerRainOnRoof.setLooping(true);
        PlayerRainOnTent = MediaPlayer.create(context, R.raw.rain_on_tent);
        PlayerRainOnRoof.setLooping(true);
        PlayerRainOnPuddle = MediaPlayer.create(context, R.raw.rain_on_puddle);
        PlayerRainOnPuddle.setLooping(true);
        PlayerWindLeaves = MediaPlayer.create(context, R.raw.wind_leaves);
        PlayerWindLeaves.setLooping(true);
        PlayerWind = MediaPlayer.create(context, R.raw.nature_wind);
        PlayerWind.setLooping(true);
        PlayerDripping = MediaPlayer.create(context, R.raw.nature_dripping);
        PlayerDripping.setLooping(true);
        PlayerBird = MediaPlayer.create(context, R.raw.bird);
        PlayerBird.setLooping(true);
        PlayerBirds = MediaPlayer.create(context, R.raw.bird2);
        PlayerBirds.setLooping(true);
        PlayerSeagull = MediaPlayer.create(context, R.raw.seagull);
        PlayerSeagull.setLooping(true);
        PlayerFrog = MediaPlayer.create(context, R.raw.animal_frog);
        PlayerFrog.setLooping(true);
        PlayerFroggs = MediaPlayer.create(context, R.raw.bird3);
        PlayerFroggs.setLooping(true);
        PlayerCricket = MediaPlayer.create(context, R.raw.animal_cricket);
        PlayerCricket.setLooping(true);
        PlayerCicada = MediaPlayer.create(context, R.raw.cicada);
        PlayerCicada.setLooping(true);
        PlayerWolf = MediaPlayer.create(context, R.raw.wolf);
        PlayerWolf.setLooping(true);
        PlayerLoon = MediaPlayer.create(context, R.raw.loon);
        PlayerLoon.setLooping(true);
        PlayerCatPurring = MediaPlayer.create(context, R.raw.cat_purring);
        PlayerCatPurring.setLooping(true);
        PlayerWhale = MediaPlayer.create(context, R.raw.whale);
        PlayerWhale.setLooping(true);
        PlayerOwl = MediaPlayer.create(context, R.raw.animal_owl);
        PlayerOwl.setLooping(true);
        PlayerCar = MediaPlayer.create(context, R.raw.instrument_car);
        PlayerCar.setLooping(true);
        PlayerCrowd = MediaPlayer.create(context, R.raw.crowd);
        PlayerCrowd.setLooping(true);
        PlayerHeartbeat = MediaPlayer.create(context, R.raw.heartbeat);
        PlayerHeartbeat.setLooping(true);
        PlayerConstructionSite = MediaPlayer.create(context, R.raw.construction_site);
        PlayerConstructionSite.setLooping(true);
        PlayerSleepTight = MediaPlayer.create(context, R.raw.sleep_tight);
        PlayerSleepTight.setLooping(true);
        PlayerDryer = MediaPlayer.create(context, R.raw.dryer);
        PlayerDryer.setLooping(true);
        PlayerHairDryer = MediaPlayer.create(context, R.raw.hair_dryer);
        PlayerHairDryer.setLooping(true);
        PlayerVacuumCleaner = MediaPlayer.create(context, R.raw.vacuum_cleaner);
        PlayerVacuumCleaner.setLooping(true);
        PlayerFan = MediaPlayer.create(context, R.raw.instrument_fan);
        PlayerFan.setLooping(true);
        PlayerClock = MediaPlayer.create(context, R.raw.instrument_clock);
        PlayerClock.setLooping(true);
        PlayerKeyboard = MediaPlayer.create(context, R.raw.instrument_keyborad);
        PlayerKeyboard.setLooping(true);
        PlayerWiper = MediaPlayer.create(context, R.raw.wiper);
        PlayerWiper.setLooping(true);
        PlayerCarsPassing = MediaPlayer.create(context, R.raw.cars_passing);
        PlayerCarsPassing.setLooping(true);
        PlayerWindChime = MediaPlayer.create(context, R.raw.wind_chime);
        PlayerWindChime.setLooping(true);
        PlayerMeditationBell = MediaPlayer.create(context, R.raw.meditation_bell);
        PlayerMeditationBell.setLooping(true);
        PlayerViolin = MediaPlayer.create(context, R.raw.violin);
        PlayerViolin.setLooping(true);
        PlayerHarp = MediaPlayer.create(context, R.raw.harp);
        PlayerHarp.setLooping(true);
        PlayerGuzheng = MediaPlayer.create(context, R.raw.guzheng);
        PlayerGuzheng.setLooping(true);
        PlayerWhiteNoise = MediaPlayer.create(context, R.raw.white_noise);
        PlayerWhiteNoise.setLooping(true);
        PlayerBrownNoise = MediaPlayer.create(context, R.raw.brown_noise);
        PlayerBrownNoise.setLooping(true);
        PlayerPinkNoise = MediaPlayer.create(context, R.raw.pink_noise);
        PlayerPinkNoise.setLooping(true);
        PlayerGuitar = MediaPlayer.create(context, R.raw.harmony);
        PlayerGuitar.setLooping(true);
        PlayerPiano = MediaPlayer.create(context, R.raw.hopeforbetter);
        PlayerPiano.setLooping(true);
        PlayerFlute = MediaPlayer.create(context, R.raw.lookwithin);
        PlayerFlute.setLooping(true);


        soundAdapter = new SoundsAdapter(context, modelArrayList, position -> {
            String SoundName = modelArrayList.get(position).getMeditationName();
            System.out.println("--?***** : " + SoundName);
            if (SoundName.equalsIgnoreCase(getString(R.string.ligth_rain))) {
                System.out.println("--?*****??? : " + PlayerLightRain.isPlaying());
                try {
                    if (!PlayerLightRain.isPlaying()) {
                        PlayerLightRain.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerLightRain.stop();
                        PlayerLightRain = MediaPlayer.create(context, R.raw.nature_rain);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.heavy_rain))) {
                try {
                    if (!PlayerHeavyRain.isPlaying()) {
                        PlayerHeavyRain.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerHeavyRain.stop();
                        PlayerHeavyRain = MediaPlayer.create(context, R.raw.nature_heavy_rain);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.thunder))) {
                try {
                    if (!PlayerThunder.isPlaying()) {
                        PlayerThunder.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerThunder.stop();
                        PlayerThunder = MediaPlayer.create(context, R.raw.nature_thunder);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.rain_on_umbrella))) {
                try {
                    if (!PlayerRainOnUmbrella.isPlaying()) {
                        PlayerRainOnUmbrella.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerRainOnUmbrella.stop();
                        PlayerRainOnUmbrella = MediaPlayer.create(context, R.raw.rain_on_umbrella);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.rain_on_window))) {
                try {
                    if (!PlayerRainOnWindow.isPlaying()) {
                        PlayerRainOnWindow.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerRainOnWindow.stop();
                        PlayerRainOnWindow = MediaPlayer.create(context, R.raw.rain_on_window);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.snow))) {
                try {
                    if (!PlayerSnow.isPlaying()) {
                        PlayerSnow.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerSnow.stop();
                        PlayerSnow = MediaPlayer.create(context, R.raw.snow);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.rain_on_roof))) {
                try {
                    if (!PlayerRainOnRoof.isPlaying()) {
                        PlayerRainOnRoof.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerRainOnRoof.stop();
                        PlayerRainOnRoof = MediaPlayer.create(context, R.raw.rain_on_roof);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.rain_on_tent))) {
                try {
                    if (!PlayerRainOnTent.isPlaying()) {
                        PlayerRainOnTent.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerRainOnTent.stop();
                        PlayerRainOnTent = MediaPlayer.create(context, R.raw.rain_on_tent);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.rain_on_puddle))) {
                try {
                    if (!PlayerRainOnPuddle.isPlaying()) {
                        PlayerRainOnPuddle.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerRainOnPuddle.stop();
                        PlayerRainOnPuddle = MediaPlayer.create(context, R.raw.rain_on_puddle);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.wind_leaves))) {
                try {
                    if (!PlayerWindLeaves.isPlaying()) {
                        PlayerWindLeaves.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerWindLeaves.stop();
                        PlayerWindLeaves = MediaPlayer.create(context, R.raw.wind_leaves);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.wind))) {
                try {
                    if (!PlayerWind.isPlaying()) {
                        PlayerWind.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerWind = MediaPlayer.create(context, R.raw.nature_wind);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.drip))) {
                try {
                    if (!PlayerDripping.isPlaying()) {
                        PlayerDripping.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerDripping.stop();
                        PlayerDripping = MediaPlayer.create(context, R.raw.nature_dripping);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.bird))) {
                try {
                    if (!PlayerBird.isPlaying()) {
                        PlayerBird.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerBird.stop();
                        PlayerBird = MediaPlayer.create(context, R.raw.bird);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.birds))) {
                try {
                    if (!PlayerBirds.isPlaying()) {
                        PlayerBirds.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerBirds.stop();
                        PlayerBirds = MediaPlayer.create(context, R.raw.bird2);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.seagull))) {
                try {
                    if (!PlayerSeagull.isPlaying()) {
                        PlayerSeagull.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerSeagull.stop();
                        PlayerSeagull = MediaPlayer.create(context, R.raw.seagull);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.frog))) {
                try {
                    if (!PlayerFrog.isPlaying()) {
                        PlayerFrog.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerFrog.stop();
                        PlayerFrog = MediaPlayer.create(context, R.raw.animal_frog);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.froggs))) {
                try {
                    if (!PlayerFroggs.isPlaying()) {
                        PlayerFroggs.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerFroggs.stop();
                        PlayerFroggs = MediaPlayer.create(context, R.raw.bird3);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.cricket))) {
                try {
                    if (!PlayerCricket.isPlaying()) {
                        PlayerCricket.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerCricket.stop();
                        PlayerCricket = MediaPlayer.create(context, R.raw.animal_cricket);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.cicada))) {
                try {
                    if (!PlayerCicada.isPlaying()) {
                        PlayerCicada.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerCicada.stop();
                        PlayerCicada = MediaPlayer.create(context, R.raw.cicada);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.wolf))) {
                try {
                    if (!PlayerWolf.isPlaying()) {
                        PlayerWolf.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerWolf.stop();
                        PlayerWolf = MediaPlayer.create(context, R.raw.wolf);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.loon))) {
                try {
                    if (!PlayerLoon.isPlaying()) {
                        PlayerLoon.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerLoon.stop();
                        PlayerLoon = MediaPlayer.create(context, R.raw.loon);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.cat_purruing))) {
                try {
                    if (!PlayerCatPurring.isPlaying()) {
                        PlayerCatPurring.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerCatPurring.stop();
                        PlayerCatPurring = MediaPlayer.create(context, R.raw.cat_purring);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.whale))) {
                try {
                    if (!PlayerWhale.isPlaying()) {
                        PlayerWhale.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerWhale.stop();
                        PlayerWhale = MediaPlayer.create(context, R.raw.whale);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.owl))) {
                try {
                    if (!PlayerOwl.isPlaying()) {
                        PlayerOwl.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerOwl.stop();
                        PlayerOwl = MediaPlayer.create(context, R.raw.animal_owl);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.car))) {
                try {
                    if (!PlayerCar.isPlaying()) {
                        PlayerCar.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerCar.stop();
                        PlayerCar = MediaPlayer.create(context, R.raw.instrument_car);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.crowd))) {
                try {
                    if (!PlayerCrowd.isPlaying()) {
                        PlayerCrowd.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerCrowd.stop();
                        PlayerCrowd = MediaPlayer.create(context, R.raw.crowd);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.heartbeat))) {
                try {
                    if (!PlayerHeartbeat.isPlaying()) {
                        PlayerHeartbeat.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerHeartbeat.stop();
                        PlayerHeartbeat = MediaPlayer.create(context, R.raw.heartbeat);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.construction_site))) {
                try {
                    if (!PlayerConstructionSite.isPlaying()) {
                        PlayerConstructionSite.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerConstructionSite.stop();
                        PlayerConstructionSite = MediaPlayer.create(context, R.raw.construction_site);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.lullaby))) {
                try {
                    if (!PlayerSleepTight.isPlaying()) {
                        PlayerSleepTight.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerSleepTight.stop();
                        PlayerSleepTight = MediaPlayer.create(context, R.raw.sleep_tight);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.dryer))) {
                try {
                    if (!PlayerDryer.isPlaying()) {
                        PlayerDryer.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerDryer.stop();
                        PlayerDryer = MediaPlayer.create(context, R.raw.dryer);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.hair_dryer))) {
                try {
                    if (!PlayerHairDryer.isPlaying()) {
                        PlayerHairDryer.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerHairDryer.stop();
                        PlayerHairDryer = MediaPlayer.create(context, R.raw.hair_dryer);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.vacuum_cleaner))) {
                try {
                    if (!PlayerVacuumCleaner.isPlaying()) {
                        PlayerVacuumCleaner.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerVacuumCleaner.stop();
                        PlayerVacuumCleaner = MediaPlayer.create(context, R.raw.vacuum_cleaner);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.fan))) {
                try {
                    if (!PlayerFan.isPlaying()) {
                        PlayerFan.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerFan.stop();
                        PlayerFan = MediaPlayer.create(context, R.raw.instrument_fan);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.clock))) {
                try {
                    if (!PlayerClock.isPlaying()) {
                        PlayerClock.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerClock.stop();
                        PlayerClock = MediaPlayer.create(context, R.raw.instrument_clock);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.keyboard))) {
                try {
                    if (!PlayerKeyboard.isPlaying()) {
                        PlayerKeyboard.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerKeyboard.stop();
                        PlayerKeyboard = MediaPlayer.create(context, R.raw.instrument_keyborad);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.wiper))) {
                try {
                    if (!PlayerWiper.isPlaying()) {
                        PlayerWiper.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerWiper.stop();
                        PlayerWiper = MediaPlayer.create(context, R.raw.wiper);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.cars_passing))) {
                try {
                    if (!PlayerCarsPassing.isPlaying()) {
                        PlayerCarsPassing.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerCarsPassing.stop();
                        PlayerCarsPassing = MediaPlayer.create(context, R.raw.cars_passing);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.wind_chime))) {
                System.out.println("******* : " + PlayerWindChime.isPlaying());
                try {
                    if (!PlayerWindChime.isPlaying()) {
                        PlayerWindChime.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerWindChime.stop();
                        PlayerWindChime = MediaPlayer.create(context, R.raw.wind_chime);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.meditation_bell))) {
                System.out.println("******* : " + PlayerMeditationBell.isPlaying());
                try {
                    if (!PlayerMeditationBell.isPlaying()) {
                        PlayerMeditationBell.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerMeditationBell.stop();
                        PlayerMeditationBell = MediaPlayer.create(context, R.raw.meditation_bell);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.violin))) {
                try {
                    if (!PlayerViolin.isPlaying()) {
                        PlayerViolin.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerViolin.stop();
                        PlayerViolin = MediaPlayer.create(context, R.raw.violin);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.harp))) {
                try {
                    if (!PlayerHarp.isPlaying()) {
                        PlayerHarp.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerHarp.stop();
                        PlayerHarp = MediaPlayer.create(context, R.raw.harp);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.guzheng))) {
                try {
                    if (!PlayerGuzheng.isPlaying()) {
                        PlayerGuzheng.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerGuzheng.stop();
                        PlayerGuzheng = MediaPlayer.create(context, R.raw.guzheng);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.white_noise))) {
                try {
                    if (!PlayerWhiteNoise.isPlaying()) {
                        PlayerWhiteNoise.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerWhiteNoise.stop();
                        PlayerWhiteNoise = MediaPlayer.create(context, R.raw.white_noise);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.brown_noise))) {
                try {
                    if (!PlayerBrownNoise.isPlaying()) {
                        PlayerBrownNoise.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerBrownNoise.stop();
                        PlayerBrownNoise = MediaPlayer.create(context, R.raw.brown_noise);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.pink_noise))) {
                try {
                    if (!PlayerPinkNoise.isPlaying()) {
                        PlayerPinkNoise.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerPinkNoise.stop();
                        PlayerPinkNoise = MediaPlayer.create(context, R.raw.pink_noise);

                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.guitar))) {
                try {
                    if (!PlayerGuitar.isPlaying()) {
                        PlayerGuitar.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerGuitar.stop();
                        PlayerGuitar = MediaPlayer.create(context, R.raw.harmony);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.piano))) {
                try {
                    if (!PlayerPiano.isPlaying()) {
                        PlayerPiano.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerPiano.stop();
                        PlayerPiano = MediaPlayer.create(context, R.raw.hopeforbetter);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            } else if (SoundName.equalsIgnoreCase(getString(R.string.flute))) {
                try {
                    if (!PlayerFlute.isPlaying()) {
                        PlayerFlute.start();
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 1));
                    } else {
                        PlayerFlute.stop();
                        PlayerFlute = MediaPlayer.create(context, R.raw.lookwithin);
                        modelArrayList.set(position, new ItemModel(modelArrayList.get(position).getMeditationName(), modelArrayList.get(position).getMeditationIcon(), 0));
                    }
                } catch (Exception e) {
                    System.out.println("--&&******&& :: " + e.getMessage());
                    e.printStackTrace();
                }
            }
            soundAdapter.notifyItemChanged(position);
        });
        RvSound.setAdapter(soundAdapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.IvBack:
                onBackPressed();
                break;
            case R.id.IvPlaySound:
                GotoPlaySound();
                break;
        }
    }

    private void GotoPlaySound() {
        if (!PlayerSound.isPlaying()) {
            PlayerSound.start();
            IvPlaySound.setImageResource(R.drawable.pause);
        } else {
            PlayerSound.stop();
            PlayerSound = MediaPlayer.create(context, ItemId);
            IvPlaySound.setImageResource(R.drawable.play);
        }
    }

    @Override
    public void onBackPressed() {
        if (PlayerSound.isPlaying()) {
            PlayerSound.stop();
        }
        if (PlayerLightRain.isPlaying()) {
            PlayerLightRain.stop();
        }
        if (PlayerHeavyRain.isPlaying()) {
            PlayerHeavyRain.stop();
        }
        if (PlayerThunder.isPlaying()) {
            PlayerThunder.stop();
        }
        if (PlayerRainOnWindow.isPlaying()) {
            PlayerRainOnWindow.stop();
        }
        if (PlayerSnow.isPlaying()) {
            PlayerSnow.stop();
        }
        if (PlayerRainOnTent.isPlaying()) {
            PlayerRainOnTent.stop();
        }
        if (PlayerRainOnRoof.isPlaying()) {
            PlayerRainOnRoof.stop();
        }
        if (PlayerRainOnPuddle.isPlaying()) {
            PlayerRainOnPuddle.stop();
        }
        if (PlayerWindLeaves.isPlaying()) {
            PlayerWindLeaves.stop();
        }
        if (PlayerDripping.isPlaying()) {
            PlayerDripping.stop();
        }
        if (PlayerBird.isPlaying()) {
            PlayerBird.stop();
        }
        if (PlayerFrog.isPlaying()) {
            PlayerFrog.stop();
        }
        if (PlayerCricket.isPlaying()) {
            PlayerCricket.stop();
        }
        if (PlayerCicada.isPlaying()) {
            PlayerCicada.stop();
        }
        if (PlayerWolf.isPlaying()) {
            PlayerWolf.stop();
        }
        if (PlayerLoon.isPlaying()) {
            PlayerLoon.stop();
        }
        if (PlayerCatPurring.isPlaying()) {
            PlayerCatPurring.stop();
        }
        if (PlayerWhale.isPlaying()) {
            PlayerWhale.stop();
        }
        if (PlayerOwl.isPlaying()) {
            PlayerOwl.stop();
        }
        if (PlayerCar.isPlaying()) {
            PlayerCar.stop();
        }
        if (PlayerCrowd.isPlaying()) {
            PlayerCrowd.stop();
        }
        if (PlayerHeartbeat.isPlaying()) {
            PlayerHeartbeat.stop();
        }
        if (PlayerConstructionSite.isPlaying()) {
            PlayerConstructionSite.stop();
        }
        if (PlayerSleepTight.isPlaying()) {
            PlayerSleepTight.stop();
        }
        if (PlayerDryer.isPlaying()) {
            PlayerDryer.stop();
        }
        if (PlayerHairDryer.isPlaying()) {
            PlayerHairDryer.stop();
        }
        if (PlayerVacuumCleaner.isPlaying()) {
            PlayerVacuumCleaner.stop();
        }
        if (PlayerFan.isPlaying()) {
            PlayerFan.stop();
        }
        if (PlayerClock.isPlaying()) {
            PlayerClock.stop();
        }
        if (PlayerKeyboard.isPlaying()) {
            PlayerKeyboard.stop();
        }
        if (PlayerWiper.isPlaying()) {
            PlayerWiper.stop();
        }
        if (PlayerCarsPassing.isPlaying()) {
            PlayerCarsPassing.stop();
        }
        if (PlayerWindChime.isPlaying()) {
            PlayerWindChime.stop();
        }
        if (PlayerMeditationBell.isPlaying()) {
            PlayerMeditationBell.stop();
        }
        if (PlayerViolin.isPlaying()) {
            PlayerViolin.stop();
        }
        if (PlayerHarp.isPlaying()) {
            PlayerHarp.stop();
        }
        if (PlayerGuzheng.isPlaying()) {
            PlayerGuzheng.stop();
        }
        if (PlayerWhiteNoise.isPlaying()) {
            PlayerWhiteNoise.stop();
        }
        if (PlayerBrownNoise.isPlaying()) {
            PlayerBrownNoise.stop();
        }
        if (PlayerPinkNoise.isPlaying()) {
            PlayerPinkNoise.stop();
        }
        if (PlayerGuitar.isPlaying()) {
            PlayerGuitar.stop();
        }
        if (PlayerPiano.isPlaying()) {
            PlayerPiano.stop();
        }
        if (PlayerFlute.isPlaying()) {
            PlayerFlute.stop();
        }
        super.onBackPressed();
    }
}