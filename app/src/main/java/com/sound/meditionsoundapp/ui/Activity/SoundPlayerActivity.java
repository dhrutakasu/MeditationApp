package com.sound.meditionsoundapp.ui.Activity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdSize;
import com.sound.meditionsoundapp.Ads.Ad_Banner;
import com.sound.meditionsoundapp.Ads.Ad_Interstitial;
import com.sound.meditionsoundapp.R;
import com.sound.meditionsoundapp.utils.Constants;

import java.io.IOException;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

public class SoundPlayerActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context;
    private ImageView IvBack, IvItemImg, IvPlaySound;
    private TextView TvTitle;
    private String StrItemName;
    private int IntItemIcon;
    private MediaPlayer PlayerSound;
    private String SoundName;
    private NestedScrollView ScrollSounds;
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

    private boolean BooolPlayerLightRain = false;
    private boolean BooolPlayerHeavyRain = false;
    private boolean BooolPlayerThunder = false;
    private boolean BooolPlayerRainOnUmbrella = false;
    private boolean BooolPlayerRainOnWindow = false;
    private boolean BooolPlayerSnow = false;
    private boolean BooolPlayerRainOnRoof = false;
    private boolean BooolPlayerRainOnTent = false;
    private boolean BooolPlayerRainOnPuddle = false;
    private boolean BooolPlayerWind = false;
    private boolean BooolPlayerWindLeaves = false;
    private boolean BooolPlayerDripping = false;
    private boolean BooolPlayerBird = false;
    private boolean BooolPlayerBirds = false;
    private boolean BooolPlayerSeagull = false;
    private boolean BooolPlayerFrog = false;
    private boolean BooolPlayerFroggs = false;
    private boolean BooolPlayerCricket = false;
    private boolean BooolPlayerCicada = false;
    private boolean BooolPlayerWolf = false;
    private boolean BooolPlayerLoon = false;
    private boolean BooolPlayerCatPurring = false;
    private boolean BooolPlayerWhale = false;
    private boolean BooolPlayerOwl = false;
    private boolean BooolPlayerCar = false;
    private boolean BooolPlayerCrowd = false;
    private boolean BooolPlayerHeartbeat = false;
    private boolean BooolPlayerConstructionSite = false;
    private boolean BooolPlayerSleepTight = false;
    private boolean BooolPlayerDryer = false;
    private boolean BooolPlayerHairDryer = false;
    private boolean BooolPlayerVacuumCleaner = false;
    private boolean BooolPlayerFan = false;
    private boolean BooolPlayerClock = false;
    private boolean BooolPlayerKeyboard = false;
    private boolean BooolPlayerWiper = false;
    private boolean BooolPlayerCarsPassing = false;
    private boolean BooolPlayerWindChime = false;
    private boolean BooolPlayerMeditationBell = false;
    private boolean BooolPlayerViolin = false;
    private boolean BooolPlayerHarp = false;
    private boolean BooolPlayerGuzheng = false;
    private boolean BooolPlayerWhiteNoise = false;
    private boolean BooolPlayerBrownNoise = false;
    private boolean BooolPlayerPinkNoise = false;
    private boolean BooolPlayerGuitar = false;
    private boolean BooolPlayerPiano = false;
    private boolean BooolPlayerFlute = false;

    private LinearLayout LlPlayLightRain;
    private LinearLayout LlPlayHeavyRain;
    private LinearLayout LlPlayThunder;
    private LinearLayout LlPlayRainOnUmbrella;
    private LinearLayout LlPlayRainOnWindow;
    private LinearLayout LlPlaySnow;
    private LinearLayout LlPlayRainOnRoof;
    private LinearLayout LlPlayRainOnTent;
    private LinearLayout LlPlayRainOnPuddle;
    private LinearLayout LlPlayWind;
    private LinearLayout LlPlayWindLeaves;
    private LinearLayout LlPlayDripping;
    private LinearLayout LlPlayBird;
    private LinearLayout LlPlayBirds;
    private LinearLayout LlPlaySeagull;
    private LinearLayout LlPlayFrog;
    private LinearLayout LlPlayFroggs;
    private LinearLayout LlPlayCricket;
    private LinearLayout LlPlayCicada;
    private LinearLayout LlPlayWolf;
    private LinearLayout LlPlayLoon;
    private LinearLayout LlPlayCatPurring;
    private LinearLayout LlPlayWhale;
    private LinearLayout LlPlayOwl;
    private LinearLayout LlPlayCar;
    private LinearLayout LlPlayCrowd;
    private LinearLayout LlPlayHeartbeat;
    private LinearLayout LlPlayConstructionSite;
    private LinearLayout LlPlayLullaby;
    private LinearLayout LlPlayDryer;
    private LinearLayout LlPlayHairDryer;
    private LinearLayout LlPlayVacuumCleaner;
    private LinearLayout LlPlayFan;
    private LinearLayout LlPlayClock;
    private LinearLayout LlPlayKeyboard;
    private LinearLayout LlPlayWiper;
    private LinearLayout LlPlayCarsPassing;
    private LinearLayout LlPlayWindChime;
    private LinearLayout LlPlayMeditationBell;
    private LinearLayout LlPlayViolin;
    private LinearLayout LlPlayHarp;
    private LinearLayout LlPlayGuzheng;
    private LinearLayout LlPlayWhiteNoise;
    private LinearLayout LlPlayBrownNoise;
    private LinearLayout LlPlayPinkNoise;
    private LinearLayout LlPlayGuitar;
    private LinearLayout LlPlayPiano;
    private LinearLayout LlPlayFlute;

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
        ScrollSounds = (NestedScrollView) findViewById(R.id.ScrollSounds);
        LlPlayLightRain = (LinearLayout) findViewById(R.id.LlPlayLightRain);
        LlPlayHeavyRain = (LinearLayout) findViewById(R.id.LlPlayHeavyRain);
        LlPlayThunder = (LinearLayout) findViewById(R.id.LlPlayThunder);
        LlPlayRainOnUmbrella = (LinearLayout) findViewById(R.id.LlPlayRainUmbrella);
        LlPlayRainOnWindow = (LinearLayout) findViewById(R.id.LlPlayRainWindow);
        LlPlaySnow = (LinearLayout) findViewById(R.id.LlPlaySnow);
        LlPlayRainOnRoof = (LinearLayout) findViewById(R.id.LlPlayRainRoof);
        LlPlayRainOnTent = (LinearLayout) findViewById(R.id.LlPlayRainTent);
        LlPlayRainOnPuddle = (LinearLayout) findViewById(R.id.LlPlayRainPuddle);
        LlPlayWind = (LinearLayout) findViewById(R.id.LlPlayWind);
        LlPlayWindLeaves = (LinearLayout) findViewById(R.id.LlPlayWindLeaves);
        LlPlayDripping = (LinearLayout) findViewById(R.id.LlPlayDripping);
        LlPlayBird = (LinearLayout) findViewById(R.id.LlPlayBird);
        LlPlayBirds = (LinearLayout) findViewById(R.id.LlPlayBirds);
        LlPlaySeagull = (LinearLayout) findViewById(R.id.LlPlaySeagull);
        LlPlayFrog = (LinearLayout) findViewById(R.id.LlPlayFrog);
        LlPlayFroggs = (LinearLayout) findViewById(R.id.LlPlayFrogs);
        LlPlayCricket = (LinearLayout) findViewById(R.id.LlPlayCricket);
        LlPlayCicada = (LinearLayout) findViewById(R.id.LlPlayCicada);
        LlPlayWolf = (LinearLayout) findViewById(R.id.LlPlayWolf);
        LlPlayLoon = (LinearLayout) findViewById(R.id.LlPlayLoon);
        LlPlayCatPurring = (LinearLayout) findViewById(R.id.LlPlayCatPurring);
        LlPlayWhale = (LinearLayout) findViewById(R.id.LlPlayWhale);
        LlPlayOwl = (LinearLayout) findViewById(R.id.LlPlayOwl);
        LlPlayCar = (LinearLayout) findViewById(R.id.LlPlayCar);
        LlPlayCrowd = (LinearLayout) findViewById(R.id.LlPlayCrowd);
        LlPlayHeartbeat = (LinearLayout) findViewById(R.id.LlPlayHeartBeat);
        LlPlayConstructionSite = (LinearLayout) findViewById(R.id.LlPlayConstructionSite);
        LlPlayLullaby = (LinearLayout) findViewById(R.id.LlPlayLullaby);
        LlPlayDryer = (LinearLayout) findViewById(R.id.LlPlayDryer);
        LlPlayHairDryer = (LinearLayout) findViewById(R.id.LlPlayHairDryer);
        LlPlayVacuumCleaner = (LinearLayout) findViewById(R.id.LlPlayVacuumCleaner);
        LlPlayFan = (LinearLayout) findViewById(R.id.LlPlayFan);
        LlPlayClock = (LinearLayout) findViewById(R.id.LlPlayClock);
        LlPlayKeyboard = (LinearLayout) findViewById(R.id.LlPlayKeyBoard);
        LlPlayWiper = (LinearLayout) findViewById(R.id.LlPlayWiper);
        LlPlayCarsPassing = (LinearLayout) findViewById(R.id.LlPlayPassingCar);
        LlPlayWindChime = (LinearLayout) findViewById(R.id.LlPlayWindChime);
        LlPlayMeditationBell = (LinearLayout) findViewById(R.id.LlPlayMeditationBell);
        LlPlayViolin = (LinearLayout) findViewById(R.id.LlPlayViolin);
        LlPlayHarp = (LinearLayout) findViewById(R.id.LlPlayHarp);
        LlPlayGuzheng = (LinearLayout) findViewById(R.id.LlPlayGuzheng);
        LlPlayWhiteNoise = (LinearLayout) findViewById(R.id.LlPlayWhiteNoise);
        LlPlayBrownNoise = (LinearLayout) findViewById(R.id.LlPlayBrownNoise);
        LlPlayPinkNoise = (LinearLayout) findViewById(R.id.LlPlayPinkNoise);
        LlPlayGuitar = (LinearLayout) findViewById(R.id.LlPlayGuitar);
        LlPlayPiano = (LinearLayout) findViewById(R.id.LlPlayPiano);
        LlPlayFlute = (LinearLayout) findViewById(R.id.LlPlayFlute);
    }

    private void initIntents() {
        StrItemName = getIntent().getStringExtra(Constants.ItemName);
        IntItemIcon = getIntent().getIntExtra(Constants.ItemIcon, -1);
    }

    private void initListeners() {
        IvBack.setOnClickListener(this);
        IvPlaySound.setOnClickListener(this);
        LlPlayLightRain.setOnClickListener(this);
        LlPlayHeavyRain.setOnClickListener(this);
        LlPlayThunder.setOnClickListener(this);
        LlPlayRainOnUmbrella.setOnClickListener(this);
        LlPlayRainOnWindow.setOnClickListener(this);
        LlPlaySnow.setOnClickListener(this);
        LlPlayRainOnRoof.setOnClickListener(this);
        LlPlayRainOnTent.setOnClickListener(this);
        LlPlayRainOnPuddle.setOnClickListener(this);
        LlPlayWind.setOnClickListener(this);
        LlPlayWindLeaves.setOnClickListener(this);
        LlPlayDripping.setOnClickListener(this);
        LlPlayBird.setOnClickListener(this);
        LlPlayBirds.setOnClickListener(this);
        LlPlaySeagull.setOnClickListener(this);
        LlPlayFrog.setOnClickListener(this);
        LlPlayFroggs.setOnClickListener(this);
        LlPlayCricket.setOnClickListener(this);
        LlPlayCicada.setOnClickListener(this);
        LlPlayWolf.setOnClickListener(this);
        LlPlayLoon.setOnClickListener(this);
        LlPlayCatPurring.setOnClickListener(this);
        LlPlayWhale.setOnClickListener(this);
        LlPlayOwl.setOnClickListener(this);
        LlPlayCar.setOnClickListener(this);
        LlPlayCrowd.setOnClickListener(this);
        LlPlayHeartbeat.setOnClickListener(this);
        LlPlayConstructionSite.setOnClickListener(this);
        LlPlayLullaby.setOnClickListener(this);
        LlPlayDryer.setOnClickListener(this);
        LlPlayHairDryer.setOnClickListener(this);
        LlPlayVacuumCleaner.setOnClickListener(this);
        LlPlayFan.setOnClickListener(this);
        LlPlayClock.setOnClickListener(this);
        LlPlayKeyboard.setOnClickListener(this);
        LlPlayWiper.setOnClickListener(this);
        LlPlayCarsPassing.setOnClickListener(this);
        LlPlayWindChime.setOnClickListener(this);
        LlPlayMeditationBell.setOnClickListener(this);
        LlPlayViolin.setOnClickListener(this);
        LlPlayHarp.setOnClickListener(this);
        LlPlayGuzheng.setOnClickListener(this);
        LlPlayWhiteNoise.setOnClickListener(this);
        LlPlayBrownNoise.setOnClickListener(this);
        LlPlayPinkNoise.setOnClickListener(this);
        LlPlayGuitar.setOnClickListener(this);
        LlPlayPiano.setOnClickListener(this);
        LlPlayFlute.setOnClickListener(this);
    }

    private void initActions() {
        Ad_Banner.getInstance().showBanner(this, AdSize.LARGE_BANNER, (RelativeLayout) findViewById(R.id.RlAdView), (RelativeLayout) findViewById(R.id.RlAdViewMain));

        TvTitle.setText(getString(R.string.now_playing));

        if (IntItemIcon != -1) {
            IvItemImg.setImageResource(IntItemIcon);
        }
        ScrollSounds.setVisibility(View.GONE);
        SoundName = StrItemName.toLowerCase().replace(" ", "");
        Ad_Interstitial.getInstance().showInter(SoundPlayerActivity.this, new Ad_Interstitial.MyCallback() {
            @Override
            public void callbackCall() {
            }
        });
        try {
            PlayerSound = new MediaPlayer();
            PlayerSound.setDataSource(Constants.BASE_URL + SoundName + Constants.BASE_URL_EXTENSION);
            PlayerSound.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        findViewById(R.id.ProgressSound).setVisibility(View.GONE);
        ScrollSounds.setVisibility(View.VISIBLE);
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
            case R.id.LlPlayLightRain:
                try {
                    if (!BooolPlayerLightRain) {
                        BooolPlayerLightRain = true;
                        PlayerLightRain = new MediaPlayer();
                        PlayerLightRain.setDataSource(Constants.BASE_URL + "nature_rain" + Constants.BASE_URL_EXTENSION);
                        PlayerLightRain.setLooping(true);
                        PlayerLightRain.prepare();
                        PlayerLightRain.start();
                        LlPlayLightRain.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerLightRain = false;
                        PlayerLightRain.stop();
                        LlPlayLightRain.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerLightRain = new MediaPlayer();
                        PlayerLightRain.setDataSource(Constants.BASE_URL + "nature_rain" + Constants.BASE_URL_EXTENSION);
                        PlayerLightRain.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayHeavyRain:
                try {
                    if (!BooolPlayerHeavyRain) {
                        BooolPlayerHeavyRain = true;
                        PlayerHeavyRain = new MediaPlayer();
                        PlayerHeavyRain.setDataSource(Constants.BASE_URL + "nature_heavy_rain" + Constants.BASE_URL_EXTENSION);
                        PlayerHeavyRain.setLooping(true);
                        PlayerHeavyRain.prepare();
                        PlayerHeavyRain.start();
                        LlPlayHeavyRain.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerHeavyRain = false;
                        PlayerHeavyRain.stop();
                        LlPlayHeavyRain.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerHeavyRain = new MediaPlayer();
                        PlayerHeavyRain.setDataSource(Constants.BASE_URL + "nature_heavy_rain" + Constants.BASE_URL_EXTENSION);
                        PlayerHeavyRain.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayThunder:
                try {
                    if (!BooolPlayerThunder) {
                        BooolPlayerThunder = true;
                        PlayerThunder = new MediaPlayer();
                        PlayerThunder.setDataSource(Constants.BASE_URL + "nature_thunder" + Constants.BASE_URL_EXTENSION);
                        PlayerThunder.setLooping(true);
                        PlayerThunder.prepare();
                        PlayerThunder.start();
                        LlPlayThunder.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerThunder = false;
                        PlayerThunder.stop();
                        LlPlayThunder.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerThunder = new MediaPlayer();
                        PlayerThunder.setDataSource(Constants.BASE_URL + "nature_thunder" + Constants.BASE_URL_EXTENSION);
                        PlayerThunder.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayRainUmbrella:
                try {
                    if (!BooolPlayerRainOnUmbrella) {
                        BooolPlayerRainOnUmbrella = true;
                        PlayerRainOnUmbrella = new MediaPlayer();
                        PlayerRainOnUmbrella.setDataSource(Constants.BASE_URL + "rain_on_umbrella" + Constants.BASE_URL_EXTENSION);
                        PlayerRainOnUmbrella.setLooping(true);
                        PlayerRainOnUmbrella.prepare();
                        PlayerRainOnUmbrella.start();
                        LlPlayRainOnUmbrella.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerRainOnUmbrella = false;
                        PlayerRainOnUmbrella.stop();
                        LlPlayRainOnUmbrella.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerRainOnUmbrella = new MediaPlayer();
                        PlayerRainOnUmbrella.setDataSource(Constants.BASE_URL + "rain_on_umbrella" + Constants.BASE_URL_EXTENSION);
                        PlayerRainOnUmbrella.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayRainWindow:
                try {
                    if (!BooolPlayerRainOnWindow) {
                        BooolPlayerRainOnWindow = true;
                        PlayerRainOnWindow = new MediaPlayer();
                        PlayerRainOnWindow.setDataSource(Constants.BASE_URL + "rain_on_window" + Constants.BASE_URL_EXTENSION);
                        PlayerRainOnWindow.setLooping(true);
                        PlayerRainOnWindow.prepare();
                        PlayerRainOnWindow.start();
                        LlPlayRainOnWindow.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerRainOnWindow = false;
                        PlayerRainOnWindow.stop();
                        LlPlayRainOnWindow.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerRainOnWindow = new MediaPlayer();
                        PlayerRainOnWindow.setDataSource(Constants.BASE_URL + "rain_on_window" + Constants.BASE_URL_EXTENSION);
                        PlayerRainOnWindow.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlaySnow:
                try {
                    if (!BooolPlayerSnow) {
                        BooolPlayerSnow = true;
                        PlayerSnow = new MediaPlayer();
                        PlayerSnow.setDataSource(Constants.BASE_URL + "snow" + Constants.BASE_URL_EXTENSION);
                        PlayerSnow.setLooping(true);
                        PlayerSnow.prepare();
                        PlayerSnow.start();
                        LlPlaySnow.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerSnow = false;
                        PlayerSnow.stop();
                        LlPlaySnow.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerSnow = new MediaPlayer();
                        PlayerSnow.setDataSource(Constants.BASE_URL + "snow" + Constants.BASE_URL_EXTENSION);
                        PlayerSnow.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayRainRoof:
                try {
                    if (!BooolPlayerRainOnRoof) {
                        BooolPlayerRainOnRoof = true;
                        PlayerRainOnRoof = new MediaPlayer();
                        PlayerRainOnRoof.setDataSource(Constants.BASE_URL + "rain_on_roof" + Constants.BASE_URL_EXTENSION);
                        PlayerRainOnRoof.setLooping(true);
                        PlayerRainOnRoof.prepare();
                        PlayerRainOnRoof.start();
                        LlPlayRainOnRoof.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerRainOnRoof = false;
                        PlayerRainOnRoof.stop();
                        LlPlayRainOnRoof.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerRainOnRoof = new MediaPlayer();
                        PlayerRainOnRoof.setDataSource(Constants.BASE_URL + "rain_on_roof" + Constants.BASE_URL_EXTENSION);
                        PlayerRainOnRoof.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayRainTent:
                try {
                    if (!BooolPlayerRainOnTent) {
                        BooolPlayerRainOnTent = true;
                        PlayerRainOnTent = new MediaPlayer();
                        PlayerRainOnTent.setDataSource(Constants.BASE_URL + "rain_on_tent" + Constants.BASE_URL_EXTENSION);
                        PlayerRainOnTent.setLooping(true);
                        PlayerRainOnTent.prepare();
                        PlayerRainOnTent.start();
                        LlPlayRainOnTent.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerRainOnTent = false;
                        PlayerRainOnTent.stop();
                        LlPlayRainOnTent.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerRainOnTent = new MediaPlayer();
                        PlayerRainOnTent.setDataSource(Constants.BASE_URL + "rain_on_tent" + Constants.BASE_URL_EXTENSION);
                        PlayerRainOnTent.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayRainPuddle:
                try {
                    if (!BooolPlayerRainOnPuddle) {
                        BooolPlayerRainOnPuddle = true;
                        PlayerRainOnPuddle = new MediaPlayer();
                        PlayerRainOnPuddle.setDataSource(Constants.BASE_URL + "rain_on_puddle" + Constants.BASE_URL_EXTENSION);
                        PlayerRainOnPuddle.setLooping(true);
                        PlayerRainOnPuddle.prepare();
                        PlayerRainOnPuddle.start();
                        LlPlayRainOnPuddle.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerRainOnPuddle = false;
                        PlayerRainOnPuddle.stop();
                        LlPlayRainOnPuddle.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerRainOnPuddle = new MediaPlayer();
                        PlayerRainOnPuddle.setDataSource(Constants.BASE_URL + "rain_on_puddle" + Constants.BASE_URL_EXTENSION);
                        PlayerRainOnPuddle.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayWind:
                try {
                    if (!BooolPlayerWind) {
                        BooolPlayerWind = true;
                        PlayerWind = new MediaPlayer();
                        PlayerWind.setDataSource(Constants.BASE_URL + "nature_wind" + Constants.BASE_URL_EXTENSION);
                        PlayerWind.setLooping(true);
                        PlayerWind.prepare();
                        PlayerWind.start();
                        LlPlayWind.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerWind = false;
                        PlayerWind.stop();
                        LlPlayWind.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerWind = new MediaPlayer();
                        PlayerWind.setDataSource(Constants.BASE_URL + "nature_wind" + Constants.BASE_URL_EXTENSION);
                        PlayerWind.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayWindLeaves:
                try {
                    if (!BooolPlayerWindLeaves) {
                        BooolPlayerWindLeaves = true;
                        PlayerWindLeaves = new MediaPlayer();
                        PlayerWindLeaves.setDataSource(Constants.BASE_URL + "wind_leaves" + Constants.BASE_URL_EXTENSION);
                        PlayerWindLeaves.setLooping(true);
                        PlayerWindLeaves.prepare();
                        PlayerWindLeaves.start();
                        LlPlayWindLeaves.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerWindLeaves = false;
                        PlayerWindLeaves.stop();
                        LlPlayWindLeaves.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerWindLeaves = new MediaPlayer();
                        PlayerWindLeaves.setDataSource(Constants.BASE_URL + "wind_leaves" + Constants.BASE_URL_EXTENSION);
                        PlayerWindLeaves.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayDripping:
                try {
                    if (!BooolPlayerDripping) {
                        BooolPlayerDripping = true;
                        PlayerDripping = new MediaPlayer();
                        PlayerDripping.setDataSource(Constants.BASE_URL + "nature_dripping" + Constants.BASE_URL_EXTENSION);
                        PlayerDripping .setLooping(true);
                        PlayerDripping.prepare();
                        PlayerDripping.start();
                        LlPlayDripping.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerDripping = false;
                        PlayerDripping.stop();
                        LlPlayDripping.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerDripping = new MediaPlayer();
                        PlayerDripping.setDataSource(Constants.BASE_URL + "nature_dripping" + Constants.BASE_URL_EXTENSION);
                        PlayerDripping.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayBird:
                try {
                    if (!BooolPlayerBird) {
                        BooolPlayerBird = true;
                        PlayerBird = new MediaPlayer();
                        PlayerBird.setDataSource(Constants.BASE_URL + "bird" + Constants.BASE_URL_EXTENSION);
                        PlayerBird .setLooping(true);;
                        PlayerBird.prepare();
                        PlayerBird.start();
                        LlPlayBird.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerBird = false;
                        PlayerBird.stop();
                        LlPlayBird.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerBird = new MediaPlayer();
                        PlayerBird.setDataSource(Constants.BASE_URL + "bird" + Constants.BASE_URL_EXTENSION);
                        PlayerBird.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayBirds:
                try {
                    if (!BooolPlayerBirds) {
                        BooolPlayerBirds = true;
                        PlayerBirds = new MediaPlayer();
                        PlayerBirds.setDataSource(Constants.BASE_URL + "bird2" + Constants.BASE_URL_EXTENSION);
                        PlayerBirds.setLooping(true);
                        PlayerBirds.prepare();
                        PlayerBirds.start();
                        LlPlayBirds.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerBirds = false;
                        PlayerBirds.stop();
                        LlPlayBirds.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerBirds = new MediaPlayer();
                        PlayerBirds.setDataSource(Constants.BASE_URL + "bird2" + Constants.BASE_URL_EXTENSION);
                        PlayerBirds.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlaySeagull:
                try {
                    if (!BooolPlayerSeagull) {
                        BooolPlayerSeagull = true;
                        PlayerSeagull = new MediaPlayer();
                        PlayerSeagull.setDataSource(Constants.BASE_URL + "seagull" + Constants.BASE_URL_EXTENSION);
                        PlayerSeagull.setLooping(true);
                        PlayerSeagull.prepare();
                        PlayerSeagull.start();
                        LlPlaySeagull.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerSeagull = false;
                        PlayerSeagull.stop();
                        LlPlaySeagull.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerSeagull = new MediaPlayer();
                        PlayerSeagull.setDataSource(Constants.BASE_URL + "seagull" + Constants.BASE_URL_EXTENSION);
                        PlayerSeagull.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayFrog:
                try {
                    if (!BooolPlayerFrog) {
                        BooolPlayerFrog = true;
                        PlayerFrog = new MediaPlayer();
                        PlayerFrog.setDataSource(Constants.BASE_URL + "animal_frog" + Constants.BASE_URL_EXTENSION);
                        PlayerFrog.setLooping(true);
                        PlayerFrog.prepare();
                        PlayerFrog.start();
                        LlPlayFrog.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerFrog = false;
                        PlayerFrog.stop();
                        LlPlayFrog.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerFrog = new MediaPlayer();
                        PlayerFrog.setDataSource(Constants.BASE_URL + "animal_frog" + Constants.BASE_URL_EXTENSION);
                        PlayerFrog.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayFrogs:
                try {
                    if (!BooolPlayerFroggs) {
                        BooolPlayerFroggs=true;
                        PlayerFroggs = new MediaPlayer();
                        PlayerFroggs.setDataSource(Constants.BASE_URL + "bird3" + Constants.BASE_URL_EXTENSION);
                        PlayerFroggs.setLooping(true);
                        PlayerFroggs.prepare();
                        PlayerFroggs.start();
                        LlPlayFroggs.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerFroggs=false;
                        PlayerFroggs.stop();
                        LlPlayFroggs.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerFroggs = new MediaPlayer();
                        PlayerFroggs.setDataSource(Constants.BASE_URL + "bird3" + Constants.BASE_URL_EXTENSION);
                        PlayerFroggs.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayCricket:
                try {
                    if (!BooolPlayerCricket) {
                        BooolPlayerCricket=true;
                        PlayerCricket = new MediaPlayer();
                        PlayerCricket.setDataSource(Constants.BASE_URL + "animal_cricket" + Constants.BASE_URL_EXTENSION);
                        PlayerCricket.setLooping(true);
                        PlayerCricket.prepare();
                        PlayerCricket.start();
                        LlPlayCricket.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerCricket=false;
                        PlayerCricket.stop();
                        LlPlayCricket.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerCricket = new MediaPlayer();
                        PlayerCricket.setDataSource(Constants.BASE_URL + "animal_cricket" + Constants.BASE_URL_EXTENSION);
                        PlayerCricket.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayCicada:
                try {
                    if (!BooolPlayerCicada) {
                        BooolPlayerCicada=true;
                        PlayerCicada = new MediaPlayer();
                        PlayerCicada.setDataSource(Constants.BASE_URL + "cicada" + Constants.BASE_URL_EXTENSION);
                        PlayerCicada.setLooping(true);
                        PlayerCicada.prepare();
                        PlayerCicada.start();
                        LlPlayCicada.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerCicada=false;
                        PlayerCicada.stop();
                        LlPlayCicada.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerCicada = new MediaPlayer();
                        PlayerCicada.setDataSource(Constants.BASE_URL + "cicada" + Constants.BASE_URL_EXTENSION);
                        PlayerCicada.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayWolf:
                try {
                    if (!BooolPlayerWolf) {
                        BooolPlayerWolf=true;
                        PlayerWolf = new MediaPlayer();
                        PlayerWolf.setDataSource(Constants.BASE_URL + "wolf" + Constants.BASE_URL_EXTENSION);
                        PlayerWolf.setLooping(true);
                        PlayerWolf.prepare();
                        PlayerWolf.start();
                        LlPlayWolf.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerWolf=false;
                        PlayerWolf.stop();
                        LlPlayWolf.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerWolf = new MediaPlayer();
                        PlayerWolf.setDataSource(Constants.BASE_URL + "wolf" + Constants.BASE_URL_EXTENSION);
                        PlayerWolf.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayLoon:
                try {
                    if (!BooolPlayerLoon) {
                        BooolPlayerLoon=true;
                        PlayerLoon = new MediaPlayer();
                        PlayerLoon.setDataSource(Constants.BASE_URL + "loon" + Constants.BASE_URL_EXTENSION);
                        PlayerLoon.setLooping(true);
                        PlayerLoon.prepare();
                        PlayerLoon.start();
                        LlPlayLoon.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerLoon=false;
                        PlayerLoon.stop();
                        LlPlayLoon.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerLoon = new MediaPlayer();
                        PlayerLoon.setDataSource(Constants.BASE_URL + "loon" + Constants.BASE_URL_EXTENSION);
                        PlayerLoon.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayCatPurring:
                try {
                    if (!BooolPlayerCatPurring) {
                        BooolPlayerCatPurring=true;
                        PlayerCatPurring = new MediaPlayer();
                        PlayerCatPurring.setDataSource(Constants.BASE_URL + "cat_purring" + Constants.BASE_URL_EXTENSION);
                        PlayerCatPurring.setLooping(true);
                        PlayerCatPurring.prepare();
                        PlayerCatPurring.start();
                        LlPlayCatPurring.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerCatPurring=false;
                        PlayerCatPurring.stop();
                        LlPlayCatPurring.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerCatPurring = new MediaPlayer();
                        PlayerCatPurring.setDataSource(Constants.BASE_URL + "cat_purring" + Constants.BASE_URL_EXTENSION);
                        PlayerCatPurring.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayWhale:
                try {
                    if (!BooolPlayerWhale) {
                        BooolPlayerWhale=true;
                        PlayerWhale = new MediaPlayer();
                        PlayerWhale.setDataSource(Constants.BASE_URL + "whale" + Constants.BASE_URL_EXTENSION);
                        PlayerWhale.setLooping(true);
                        PlayerWhale.prepare();
                        PlayerWhale.start();
                        LlPlayWhale.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerWhale=false;
                        PlayerWhale.stop();
                        LlPlayWhale.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerWhale = new MediaPlayer();
                        PlayerWhale.setDataSource(Constants.BASE_URL + "whale" + Constants.BASE_URL_EXTENSION);
                        PlayerWhale.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayOwl:
                try {
                    if (!BooolPlayerOwl) {
                        BooolPlayerOwl=true;
                        PlayerOwl = new MediaPlayer();
                        PlayerOwl.setDataSource(Constants.BASE_URL + "animal_owl" + Constants.BASE_URL_EXTENSION);
                        PlayerOwl.setLooping(true);
                        PlayerOwl.prepare();
                        PlayerOwl.start();
                        LlPlayOwl.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerOwl=false;
                        PlayerOwl.stop();
                        LlPlayOwl.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerOwl = new MediaPlayer();
                        PlayerOwl.setDataSource(Constants.BASE_URL + "animal_owl" + Constants.BASE_URL_EXTENSION);
                        PlayerOwl.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayCar:
                try {
                    if (!BooolPlayerCar) {
                        BooolPlayerCar=true;
                        PlayerCar = new MediaPlayer();
                        PlayerCar.setDataSource(Constants.BASE_URL + "instrument_car" + Constants.BASE_URL_EXTENSION);
                        PlayerCar.setLooping(true);
                        PlayerCar.prepare();
                        PlayerCar.start();
                        LlPlayCar.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerCar=false;
                        PlayerCar.stop();
                        LlPlayCar.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerCar = new MediaPlayer();
                        PlayerCar.setDataSource(Constants.BASE_URL + "instrument_car" + Constants.BASE_URL_EXTENSION);
                        PlayerCar.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayCrowd:
                try {
                    if (!BooolPlayerCrowd) {
                        BooolPlayerCrowd=true;
                        PlayerCrowd = new MediaPlayer();
                        PlayerCrowd.setDataSource(Constants.BASE_URL + "crowd" + Constants.BASE_URL_EXTENSION);
                        PlayerCrowd.setLooping(true);
                        PlayerCrowd.prepare();
                        PlayerCrowd.start();
                        LlPlayCrowd.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerCrowd=false;
                        PlayerCrowd.stop();
                        LlPlayCrowd.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerCrowd = new MediaPlayer();
                        PlayerCrowd.setDataSource(Constants.BASE_URL + "crowd" + Constants.BASE_URL_EXTENSION);
                        PlayerCrowd.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayHeartBeat:
                try {
                    if (!BooolPlayerHeartbeat) {
                        BooolPlayerHeartbeat=true;
                        PlayerHeartbeat = new MediaPlayer();
                        PlayerHeartbeat.setDataSource(Constants.BASE_URL + "heartbeat" + Constants.BASE_URL_EXTENSION);
                        PlayerHeartbeat.setLooping(true);
                        PlayerHeartbeat.prepare();
                        PlayerHeartbeat.start();
                        LlPlayHeartbeat.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerHeartbeat=false;
                        PlayerHeartbeat.stop();
                        LlPlayHeartbeat.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerHeartbeat = new MediaPlayer();
                        PlayerHeartbeat.setDataSource(Constants.BASE_URL + "heartbeat" + Constants.BASE_URL_EXTENSION);
                        PlayerHeartbeat.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayConstructionSite:
                try {
                    if (!BooolPlayerConstructionSite) {
                        BooolPlayerConstructionSite=true;
                        PlayerConstructionSite = new MediaPlayer();
                        PlayerConstructionSite.setDataSource(Constants.BASE_URL + "construction_site" + Constants.BASE_URL_EXTENSION);
                        PlayerConstructionSite.setLooping(true);
                        PlayerConstructionSite.prepare();
                        PlayerConstructionSite.start();
                        LlPlayConstructionSite.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerConstructionSite=false;
                        PlayerConstructionSite.stop();
                        LlPlayConstructionSite.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerConstructionSite = new MediaPlayer();
                        PlayerConstructionSite.setDataSource(Constants.BASE_URL + "construction_site" + Constants.BASE_URL_EXTENSION);
                        PlayerConstructionSite.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayLullaby:
                try {
                    if (!BooolPlayerSleepTight) {
                        BooolPlayerSleepTight=true;
                        PlayerSleepTight = new MediaPlayer();
                        PlayerSleepTight.setDataSource(Constants.BASE_URL + "sleep_tight" + Constants.BASE_URL_EXTENSION);
                        PlayerSleepTight.setLooping(true);
                        PlayerSleepTight.prepare();
                        PlayerSleepTight.start();
                        LlPlayLullaby.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerSleepTight=false;
                        PlayerSleepTight.stop();
                        LlPlayLullaby.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerSleepTight = new MediaPlayer();
                        PlayerSleepTight.setDataSource(Constants.BASE_URL + "sleep_tight" + Constants.BASE_URL_EXTENSION);
                        PlayerSleepTight.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayDryer:
                try {
                    if (!BooolPlayerDryer) {
                        BooolPlayerDryer=true;
                        PlayerDryer = new MediaPlayer();
                        PlayerDryer.setDataSource(Constants.BASE_URL + "dryer" + Constants.BASE_URL_EXTENSION);
                        PlayerDryer.setLooping(true);
                        PlayerDryer.prepare();
                        PlayerDryer.start();
                        LlPlayDryer.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerDryer=false;
                        PlayerDryer.stop();
                        LlPlayDryer.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerDryer = new MediaPlayer();
                        PlayerDryer.setDataSource(Constants.BASE_URL + "dryer" + Constants.BASE_URL_EXTENSION);
                        PlayerDryer.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayHairDryer:
                try {
                    if (!BooolPlayerHairDryer) {
                        BooolPlayerHairDryer=true;
                        PlayerHairDryer = new MediaPlayer();
                        PlayerHairDryer.setDataSource(Constants.BASE_URL + "hair_dryer" + Constants.BASE_URL_EXTENSION);
                        PlayerHairDryer.setLooping(true);
                        PlayerHairDryer.prepare();
                        PlayerHairDryer.start();
                        LlPlayHairDryer.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerHairDryer=false;
                        PlayerHairDryer.stop();
                        LlPlayHairDryer.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerHairDryer = new MediaPlayer();
                        PlayerHairDryer.setDataSource(Constants.BASE_URL + "hair_dryer" + Constants.BASE_URL_EXTENSION);
                        PlayerHairDryer.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayVacuumCleaner:
                try {
                    if (!BooolPlayerVacuumCleaner) {
                        BooolPlayerVacuumCleaner=true;
                        PlayerVacuumCleaner = new MediaPlayer();
                        PlayerVacuumCleaner.setDataSource(Constants.BASE_URL + "vacuum_cleaner" + Constants.BASE_URL_EXTENSION);
                        PlayerVacuumCleaner.setLooping(true);
                        PlayerVacuumCleaner.prepare();
                        PlayerVacuumCleaner.start();
                        LlPlayVacuumCleaner.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerVacuumCleaner=false;
                        PlayerVacuumCleaner.stop();
                        LlPlayVacuumCleaner.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerVacuumCleaner = new MediaPlayer();
                        PlayerVacuumCleaner.setDataSource(Constants.BASE_URL + "vacuum_cleaner" + Constants.BASE_URL_EXTENSION);
                        PlayerVacuumCleaner.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayFan:
                try {
                    if (!BooolPlayerFan) {
                        BooolPlayerFan=true;
                        PlayerFan = new MediaPlayer();
                        PlayerFan.setDataSource(Constants.BASE_URL + "instrument_fan" + Constants.BASE_URL_EXTENSION);
                        PlayerFan.setLooping(true);
                        PlayerFan.prepare();
                        PlayerFan.start();
                        LlPlayFan.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerFan=false;
                        PlayerFan.stop();
                        LlPlayFan.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerFan = new MediaPlayer();
                        PlayerFan.setDataSource(Constants.BASE_URL + "instrument_fan" + Constants.BASE_URL_EXTENSION);
                        PlayerFan.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayClock:
                try {
                    if (!BooolPlayerClock) {
                        BooolPlayerClock=true;
                        PlayerClock = new MediaPlayer();
                        PlayerClock.setDataSource(Constants.BASE_URL + "instrument_clock" + Constants.BASE_URL_EXTENSION);
                        PlayerClock.setLooping(true);
                        PlayerClock.prepare();
                        PlayerClock.start();
                        LlPlayClock.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerClock=false;
                        PlayerClock.stop();
                        LlPlayClock.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerClock = new MediaPlayer();
                        PlayerClock.setDataSource(Constants.BASE_URL + "instrument_clock" + Constants.BASE_URL_EXTENSION);
                        PlayerClock.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayKeyBoard:
                try {
                    if (!BooolPlayerKeyboard) {
                        BooolPlayerKeyboard=true;
                        PlayerKeyboard = new MediaPlayer();
                        PlayerKeyboard.setDataSource(Constants.BASE_URL + "instrument_keyborad" + Constants.BASE_URL_EXTENSION);
                        PlayerKeyboard.setLooping(true);
                        PlayerKeyboard.prepare();
                        PlayerKeyboard.start();
                        LlPlayKeyboard.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerKeyboard=false;
                        PlayerKeyboard.stop();
                        LlPlayKeyboard.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerKeyboard = new MediaPlayer();
                        PlayerKeyboard.setDataSource(Constants.BASE_URL + "instrument_keyborad" + Constants.BASE_URL_EXTENSION);
                        PlayerKeyboard.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayWiper:
                try {
                    if (!BooolPlayerWiper) {
                        BooolPlayerWiper=true;
                        PlayerWiper = new MediaPlayer();
                        PlayerWiper.setDataSource(Constants.BASE_URL + "wiper" + Constants.BASE_URL_EXTENSION);
                        PlayerWiper.setLooping(true);
                        PlayerWiper.prepare();
                        PlayerWiper.start();
                        LlPlayWiper.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerWiper=false;
                        PlayerWiper.stop();
                        LlPlayWiper.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerWiper = new MediaPlayer();
                        PlayerWiper.setDataSource(Constants.BASE_URL + "wiper" + Constants.BASE_URL_EXTENSION);
                        PlayerWiper.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayPassingCar:
                try {
                    if (!BooolPlayerCarsPassing) {
                        BooolPlayerCarsPassing=true;
                        PlayerCarsPassing = new MediaPlayer();
                        PlayerCarsPassing.setDataSource(Constants.BASE_URL + "cars_passing" + Constants.BASE_URL_EXTENSION);
                        PlayerCarsPassing.setLooping(true);
                        PlayerCarsPassing.prepare();
                        PlayerCarsPassing.start();
                        LlPlayCarsPassing.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerCarsPassing=false;
                        PlayerCarsPassing.stop();
                        LlPlayCarsPassing.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerCarsPassing = new MediaPlayer();
                        PlayerCarsPassing.setDataSource(Constants.BASE_URL + "cars_passing" + Constants.BASE_URL_EXTENSION);
                        PlayerCarsPassing.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayWindChime:
                try {
                    if (!BooolPlayerWindChime) {
                        BooolPlayerWindChime=true;
                        PlayerWindChime = new MediaPlayer();
                        PlayerWindChime.setDataSource(Constants.BASE_URL + "wind_chime" + Constants.BASE_URL_EXTENSION);
                        PlayerWindChime.setLooping(true);
                        PlayerWindChime.prepare();
                        PlayerWindChime.start();
                        LlPlayWindChime.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerWindChime=false;
                        PlayerWindChime.stop();
                        LlPlayWindChime.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerWindChime = new MediaPlayer();
                        PlayerWindChime.setDataSource(Constants.BASE_URL + "wind_chime" + Constants.BASE_URL_EXTENSION);
                        PlayerWindChime.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayMeditationBell:
                try {
                    if (!BooolPlayerMeditationBell) {
                        BooolPlayerMeditationBell=true;
                        PlayerMeditationBell = new MediaPlayer();
                        PlayerMeditationBell.setDataSource(Constants.BASE_URL + "meditation_bell" + Constants.BASE_URL_EXTENSION);
                        PlayerMeditationBell.setLooping(true);
                        PlayerMeditationBell.prepare();
                        PlayerMeditationBell.start();
                        LlPlayMeditationBell.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerMeditationBell=false;
                        PlayerMeditationBell.stop();
                        LlPlayMeditationBell.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerMeditationBell = new MediaPlayer();
                        PlayerMeditationBell.setDataSource(Constants.BASE_URL + "meditation_bell" + Constants.BASE_URL_EXTENSION);
                        PlayerMeditationBell.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayViolin:
                try {
                    if (!BooolPlayerViolin) {
                        BooolPlayerViolin=true;
                        PlayerViolin = new MediaPlayer();
                        PlayerViolin.setDataSource(Constants.BASE_URL + "violin" + Constants.BASE_URL_EXTENSION);
                        PlayerViolin.setLooping(true);
                        PlayerViolin.prepare();
                        PlayerViolin.start();
                        LlPlayViolin.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerViolin=false;
                        PlayerViolin.stop();
                        LlPlayViolin.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerViolin = new MediaPlayer();
                        PlayerViolin.setDataSource(Constants.BASE_URL + "violin" + Constants.BASE_URL_EXTENSION);
                        PlayerViolin.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayHarp:
                try {
                    if (!BooolPlayerHarp) {
                        BooolPlayerHarp=true;
                        PlayerHarp = new MediaPlayer();
                        PlayerHarp.setDataSource(Constants.BASE_URL + "harp" + Constants.BASE_URL_EXTENSION);
                        PlayerHarp.setLooping(true);
                        PlayerHarp.prepare();
                        PlayerHarp.start();
                        LlPlayHarp.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerHarp=false;
                        PlayerHarp.stop();
                        LlPlayHarp.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerHarp = new MediaPlayer();
                        PlayerHarp.setDataSource(Constants.BASE_URL + "harp" + Constants.BASE_URL_EXTENSION);
                        PlayerHarp.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayGuzheng:
                try {
                    if (!BooolPlayerGuzheng) {
                        BooolPlayerGuzheng=true;
                        PlayerGuzheng = new MediaPlayer();
                        PlayerGuzheng.setDataSource(Constants.BASE_URL + "guzheng" + Constants.BASE_URL_EXTENSION);
                        PlayerGuzheng.setLooping(true);
                        PlayerGuzheng.prepare();
                        PlayerGuzheng.start();
                        LlPlayGuzheng.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerGuzheng=false;
                        PlayerGuzheng.stop();
                        LlPlayGuzheng.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerGuzheng = new MediaPlayer();
                        PlayerGuzheng.setDataSource(Constants.BASE_URL + "guzheng" + Constants.BASE_URL_EXTENSION);
                        PlayerGuzheng.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayWhiteNoise:
                try {
                    if (!BooolPlayerWhiteNoise) {
                        BooolPlayerWhiteNoise=true;
                        PlayerWhiteNoise = new MediaPlayer();
                        PlayerWhiteNoise.setDataSource(Constants.BASE_URL + "white_noise" + Constants.BASE_URL_EXTENSION);
                        PlayerWhiteNoise.setLooping(true);
                        PlayerWhiteNoise.prepare();
                        PlayerWhiteNoise.start();
                        LlPlayWhiteNoise.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerWhiteNoise=false;
                        PlayerWhiteNoise.stop();
                        LlPlayWhiteNoise.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerWhiteNoise = new MediaPlayer();
                        PlayerWhiteNoise.setDataSource(Constants.BASE_URL + "white_noise" + Constants.BASE_URL_EXTENSION);
                        PlayerWhiteNoise.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayBrownNoise:
                try {
                    if (!BooolPlayerBrownNoise) {
                        BooolPlayerBrownNoise=true;
                        PlayerBrownNoise = new MediaPlayer();
                        PlayerBrownNoise.setDataSource(Constants.BASE_URL + "brown_noise" + Constants.BASE_URL_EXTENSION);
                        PlayerBrownNoise.setLooping(true);
                        PlayerBrownNoise.prepare();
                        PlayerBrownNoise.start();
                        LlPlayBrownNoise.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerBrownNoise=false;
                        PlayerBrownNoise.stop();
                        LlPlayBrownNoise.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerBrownNoise = new MediaPlayer();
                        PlayerBrownNoise.setDataSource(Constants.BASE_URL + "brown_noise" + Constants.BASE_URL_EXTENSION);
                        PlayerBrownNoise.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayPinkNoise:
                try {
                    if (!BooolPlayerPinkNoise) {
                        BooolPlayerPinkNoise=true;
                        PlayerPinkNoise = new MediaPlayer();
                        PlayerPinkNoise.setDataSource(Constants.BASE_URL + "pink_noise" + Constants.BASE_URL_EXTENSION);
                        PlayerPinkNoise.setLooping(true);
                        PlayerPinkNoise.prepare();
                        PlayerPinkNoise.start();
                        LlPlayPinkNoise.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerPinkNoise=false;
                        PlayerPinkNoise.stop();
                        LlPlayPinkNoise.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerPinkNoise = new MediaPlayer();
                        PlayerPinkNoise.setDataSource(Constants.BASE_URL + "pink_noise" + Constants.BASE_URL_EXTENSION);
                        PlayerPinkNoise.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayGuitar:
                try {
                    if (!BooolPlayerGuitar) {
                        BooolPlayerGuitar=true;
                        PlayerGuitar = new MediaPlayer();
                        PlayerGuitar.setDataSource(Constants.BASE_URL + "harmony" + Constants.BASE_URL_EXTENSION);
                        PlayerGuitar.setLooping(true);
                        PlayerGuitar.prepare();
                        PlayerGuitar.start();
                        LlPlayGuitar.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerGuitar=false;
                        PlayerGuitar.stop();
                        LlPlayGuitar.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerGuitar = new MediaPlayer();
                        PlayerGuitar.setDataSource(Constants.BASE_URL + "harmony" + Constants.BASE_URL_EXTENSION);
                        PlayerGuitar.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayPiano:
                try {
                    if (!BooolPlayerPiano) {
                        BooolPlayerPiano=true;
                        PlayerPiano = new MediaPlayer();
                        PlayerPiano.setDataSource(Constants.BASE_URL + "hopeforbetter" + Constants.BASE_URL_EXTENSION);
                        PlayerPiano.setLooping(true);
                        PlayerPiano.prepare();
                        PlayerPiano.start();
                        LlPlayPiano.setBackgroundResource(R.drawable.ic_item_background_color);
                    } else {
                        BooolPlayerPiano=false;
                        PlayerPiano.stop();
                        LlPlayPiano.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerPiano = new MediaPlayer();
                        PlayerPiano.setDataSource(Constants.BASE_URL + "hopeforbetter" + Constants.BASE_URL_EXTENSION);
                        PlayerPiano.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.LlPlayFlute:
                try {
                    if (!BooolPlayerFlute) {
                        BooolPlayerFlute=true;
                        PlayerFlute = new MediaPlayer();
                        PlayerFlute.setDataSource(Constants.BASE_URL + "lookwithin" + Constants.BASE_URL_EXTENSION);
                        PlayerFlute.setLooping(true);
                        PlayerFlute.prepare();
                        LlPlayFlute.setBackgroundResource(R.drawable.ic_item_background_color);
                        PlayerFlute.start();
                    } else {
                        BooolPlayerFlute=false;
                        PlayerFlute.stop();
                        LlPlayFlute.setBackgroundResource(R.drawable.ic_sound_color);
                        PlayerFlute = new MediaPlayer();
                        PlayerFlute.setDataSource(Constants.BASE_URL + "lookwithin" + Constants.BASE_URL_EXTENSION);
                        PlayerFlute.prepare();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    private void GotoPlaySound() {
        if (findViewById(R.id.ProgressSound).getVisibility() == View.VISIBLE) {
            Toast.makeText(context, "Please wait sound is loaded... ", Toast.LENGTH_SHORT).show();
        } else {
            try {
                if (!PlayerSound.isPlaying()) {
                    PlayerSound.start();
                    IvPlaySound.setImageResource(R.drawable.ic_pause);
                } else {
                    PlayerSound.stop();
                    PlayerSound.prepare();
                    IvPlaySound.setImageResource(R.drawable.ic_play);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (findViewById(R.id.ProgressSound).getVisibility() == View.VISIBLE) {
            Toast.makeText(context, "Please wait sound is loaded... ", Toast.LENGTH_SHORT).show();
        } else {
            if (PlayerSound.isPlaying()) {
                PlayerSound.stop();
            }
            if (PlayerLightRain != null && PlayerLightRain.isPlaying()) {
                PlayerLightRain.stop();
            }
            if (PlayerHeavyRain != null && PlayerHeavyRain.isPlaying()) {
                PlayerHeavyRain.stop();
            }
            if (PlayerThunder != null && PlayerThunder.isPlaying()) {
                PlayerThunder.stop();
            }
            if (PlayerRainOnUmbrella != null && PlayerRainOnUmbrella.isPlaying()) {
                PlayerRainOnUmbrella.stop();
            }
            if (PlayerRainOnWindow != null && PlayerRainOnWindow.isPlaying()) {
                PlayerRainOnWindow.stop();
            }
            if (PlayerSnow != null && PlayerSnow.isPlaying()) {
                PlayerSnow.stop();
            }
            if (PlayerRainOnTent != null && PlayerRainOnTent.isPlaying()) {
                PlayerRainOnTent.stop();
            }
            if (PlayerRainOnRoof != null && PlayerRainOnRoof.isPlaying()) {
                PlayerRainOnRoof.stop();
            }
            if (PlayerRainOnPuddle != null && PlayerRainOnPuddle.isPlaying()) {
                PlayerRainOnPuddle.stop();
            }
            if (PlayerWind != null && PlayerWind.isPlaying()) {
                PlayerWind.stop();
            }
            if (PlayerWindLeaves != null && PlayerWindLeaves.isPlaying()) {
                PlayerWindLeaves.stop();
            }
            if (PlayerDripping != null && PlayerDripping.isPlaying()) {
                PlayerDripping.stop();
            }
            if (PlayerBird != null && PlayerBird.isPlaying()) {
                PlayerBird.stop();
            }
            if (PlayerBirds != null && PlayerBirds.isPlaying()) {
                PlayerBirds.stop();
            }
            if (PlayerSeagull != null && PlayerSeagull.isPlaying()) {
                PlayerSeagull.stop();
            }
            if (PlayerFrog != null && PlayerFrog.isPlaying()) {
                PlayerFrog.stop();
            }
            if (PlayerFroggs != null && PlayerFroggs.isPlaying()) {
                PlayerFroggs.stop();
            }
            if (PlayerCricket != null && PlayerCricket.isPlaying()) {
                PlayerCricket.stop();
            }
            if (PlayerCicada != null && PlayerCicada.isPlaying()) {
                PlayerCicada.stop();
            }
            if (PlayerWolf != null && PlayerWolf.isPlaying()) {
                PlayerWolf.stop();
            }
            if (PlayerLoon != null && PlayerLoon.isPlaying()) {
                PlayerLoon.stop();
            }
            if (PlayerCatPurring != null && PlayerCatPurring.isPlaying()) {
                PlayerCatPurring.stop();
            }
            if (PlayerWhale != null && PlayerWhale.isPlaying()) {
                PlayerWhale.stop();
            }
            if (PlayerOwl != null && PlayerOwl.isPlaying()) {
                PlayerOwl.stop();
            }
            if (PlayerCar != null && PlayerCar.isPlaying()) {
                PlayerCar.stop();
            }
            if (PlayerCrowd != null && PlayerCrowd.isPlaying()) {
                PlayerCrowd.stop();
            }
            if (PlayerHeartbeat != null && PlayerHeartbeat.isPlaying()) {
                PlayerHeartbeat.stop();
            }
            if (PlayerConstructionSite != null && PlayerConstructionSite.isPlaying()) {
                PlayerConstructionSite.stop();
            }
            if (PlayerSleepTight != null && PlayerSleepTight.isPlaying()) {
                PlayerSleepTight.stop();
            }
            if (PlayerDryer != null && PlayerDryer.isPlaying()) {
                PlayerDryer.stop();
            }
            if (PlayerHairDryer != null && PlayerHairDryer.isPlaying()) {
                PlayerHairDryer.stop();
            }
            if (PlayerVacuumCleaner != null && PlayerVacuumCleaner.isPlaying()) {
                PlayerVacuumCleaner.stop();
            }
            if (PlayerFan != null && PlayerFan.isPlaying()) {
                PlayerFan.stop();
            }
            if (PlayerClock != null && PlayerClock.isPlaying()) {
                PlayerClock.stop();
            }
            if (PlayerKeyboard != null && PlayerKeyboard.isPlaying()) {
                PlayerKeyboard.stop();
            }
            if (PlayerWiper != null && PlayerWiper.isPlaying()) {
                PlayerWiper.stop();
            }
            if (PlayerCarsPassing != null && PlayerCarsPassing.isPlaying()) {
                PlayerCarsPassing.stop();
            }
            if (PlayerWindChime != null && PlayerWindChime.isPlaying()) {
                PlayerWindChime.stop();
            }
            if (PlayerMeditationBell != null && PlayerMeditationBell.isPlaying()) {
                PlayerMeditationBell.stop();
            }
            if (PlayerViolin != null && PlayerViolin.isPlaying()) {
                PlayerViolin.stop();
            }
            if (PlayerHarp != null && PlayerHarp.isPlaying()) {
                PlayerHarp.stop();
            }
            if (PlayerGuzheng != null && PlayerGuzheng.isPlaying()) {
                PlayerGuzheng.stop();
            }
            if (PlayerWhiteNoise != null && PlayerWhiteNoise.isPlaying()) {
                PlayerWhiteNoise.stop();
            }
            if (PlayerBrownNoise != null && PlayerBrownNoise.isPlaying()) {
                PlayerBrownNoise.stop();
            }
            if (PlayerPinkNoise != null && PlayerPinkNoise.isPlaying()) {
                PlayerPinkNoise.stop();
            }
            if (PlayerGuitar != null && PlayerGuitar.isPlaying()) {
                PlayerGuitar.stop();
            }
            if (PlayerPiano != null && PlayerPiano.isPlaying()) {
                PlayerPiano.stop();
            }
            if (PlayerFlute != null && PlayerFlute.isPlaying()) {
                PlayerFlute.stop();
            }

            Ad_Interstitial.getInstance().showInter(SoundPlayerActivity.this, () -> finish());
        }
    }
}