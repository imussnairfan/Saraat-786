package com.example.project_saraat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Concepts_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Concepts_frag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    RecyclerViewAdapter2 recyclerViewAdapter;
    List<Concepts> concepts = new ArrayList<>();

    public Concepts_frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Concepts_frag.
     */
    // TODO: Rename and change types and number of parameters
    public static Concepts_frag newInstance(String param1, String param2) {
        Concepts_frag fragment = new Concepts_frag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_concepts_frag, container, false);
        recyclerView = view.findViewById(R.id.rv_concepts);

        concepts.add(new Concepts("Concept of Dreams", "Dreams we learn in Quran and Sunnah can occur from Allah (SWT), they can occur from shaitan and they can be your imagination. Dreams are of three types:....", "Concept of Dreams\n" +
                "\n" +
                "Dreams we learn in Quran and Sunnah can occur from Allah (SWT), they can occur from shaitan and they can be your imagination. Dreams are of three types:\n" +
                "1) Dreams of your Imagination\n" +
                "2) Dreams from Shaitan\n" +
                "3) Dreams from Allah \n" +
                "\n" +
                "Dreams from your Imagination \n" +
                "These dreams are also called Hadees-un-Nafs. For example, if you want to buy a latest car, you want to buy Mercedes and you are thinking of it and day dreaming. You go to sleep and behold, you are driving that car. This is your Hadees-un-Nafs, this is your imagination. Scientists says that these kind of dreams occur every night. There is a phase in our sleep when it's called REM (Rapid Eye Movement). There is a phase in every single night where everybody dreams. The sign of this kind of dream is when you wake up  the dream is absolutely fresh  but within 5 seconds it's gone. This is the indication  that it is this kind of dream, the dream of imagination. External impulses affect this kind of dream so if somebody is going to through water on your face you are going to dream that you are drowning on something. If somebody is calling you to wake up! It's time for fajr then into your dream it will be translated that somebody is waking you up. That type of dream has nothing to do with your good or bad  because its your own imagination (Hadees-un-Nafs) and the sign of it you don't remember it at all, you wake up and within 5 minutes by the time it's middle of the day you don't remember anything about the dream. This is a sign Hadees-un-Nafs.\n" +
                "\n" +
                "Dreams from Shaitan\n" +
                "The second type of dream is evil dream (dreams from shaytaan) in English it is called \"NightMares\" and in Arabic it is called \"Hulm\". These kind of dreams are from shaytaan and the sign of this dream is it terrifies you, you see something evil, something disgusting. For example, you see your loved ones are dying miserable death, you see yourself chased by some evils or beasts or something like this. This type of dream is just shayateen wanting to irritate you. They are trying a play a practical joke on you. They are irritating because you are a Muslim even non Muslims also have nightmares but these are shayateen playing with you at your expense. These types of dreams are never ever true, nobody should believe this dream. Our Prophet Muhammad (PBUH) said that nightmares should not be told to anybody. If you see an evil dream don't go and tell other people about it because shaytaan is making a fool of you. Once a man came to Prophet Muhammad (PBUH) and said  \"O Messenger of Allah! I saw my head cut off in a dream and it was rolling like a ball and I am running after to pick it up \". The Prophet (PBUH) said \"Don't go and tell other people how shaytaan played with you last night, Don't go tell other people this  because he is laughing now when you go tell him because you believed this dream \". The sign of this kind of dream is you wake up terrified, you wake up sweat, you wake up in the middle of the night this is the sign that this is shaytaan. Shaytaan does not know the future if something come to your dream and you are believing it then he will laugh at you. You have to reject the nightmares because there is no truth, not an element of truth in it and if you follow it and believe it shaytaan will be the one who will be the winner. A nightmare Prophet Muhammad (PBUH) said  \"if you wake up with that kind of nightmare, you seek refuge from shaytaan, say  أَعُوْذُ بِاللّٰهِ مِنَ الشَّيْطٰانِ الرَّجِيْمِ and you are allowed to spit  on the left hand side  as you do this \". The spit that the Prophet (PBUH) talked about is a spit where the noise is made but nothing comes out and that is to expel shaytaan comes out  and say أَعُوْذُ بِاللّٰهِ مِنَ الشَّيْطٰانِ الرَّجِيْمِ also Prophet (PBUH) said \"Whatever wide you are on, turned to the other side\" because when shaytaan is teasing you, he is around you or sitting on you so when you say أَعُوْذُ بِاللّٰهِ مِنَ الشَّيْطٰانِ الرَّجِ. he has to flee and run away. The Prophet Muhammad (PBUH) said \"Even if it's really bad stand up and pray two rakaat to seek refuge from shaytaan and to establish a relationship with Allah\". For dreams with vulgarity that is wet dreams, you should take shower and seek refuge from shaytaan because you have no control over your dreams.\n" +
                "\n" +
                "Dreams from Allah\n" +
                "This type of dream is also called \"Mubashshiraat\" or also called in Arabic \"Ru'Yah\". Ru'Yah is a vision from Allah, it is a positive dream and no dream from Allah will cause you awake in a frightened state, you will not be terrified by that. It would be Mubashshirah that is glad tidings, good news, something optimistic and even if it's not positive it will be a factual statement, it will be something true not something terrifying. The sign of the dream is you will wake up remembering the dream vividly so it's not Hadees un Nafs and you will wake up not in a terrified state when these two conditions will met then that's obvious and it's possible that it is Mubashshir. Sometimes you wake up in a positive state because you saw something positive and sometimes you wake up in a neutral state you are not scared, you are not happy but you might be confused What did you see? But you will never gonna wake up terrified but if you wake up terrified than it's not from Allah it is from Shaytaan. Dreams from Allah are one of two types i.e. no Symbolism and Symbolism.\n" +
                "\n" +
                "Non symbolism is very less common in which you see an actual event with you in it without any symbolism. You see something that will happen in future and it's a direct if you like, if you watched, if you like an enactment of the future this is exactly what will happen. The Prophet (PBUH) saw a dream that he is doing tawaaf around the Kaaba around 6th year of Hijrah. When He saw the dream there was no symbolism, He knew this is not a symbolic dream. When the Prophet(PBUH) was prevented  going to Mecca He saw a dream, there's no symbolism \"I saw myself doing tawaaf  and shaving my hair\". This will happen Allah said in Quran\"This dream that you saw is a true dream you are going to enter Masjid-al-Haram it will happen next year\". This kind of dream is rare, very rare but it was common to the Prophets. With regards to such kind of dreams our Prophet (PBUH) narrates, Aisha(RA) tells us that for six months before the revelation of the Quran every single night Prophet (PBUH) would see one of these dreams. Non-stop for six months, everytime when Prophet (PBUH) would go to sleep He would dream what's going to happen tomorrow. He might be in the market place buying and selling He dreams it. Next day, the exact same things happen. He dreams he is going to meet somebody next day the same person comes to meet Him. All this happened because Allah is telling him that something special is going to happen with you preparing Him for revelation of \"Iqra\". For six months this happens continuously and then Iqra is revealed.\n"));
        concepts.add(new Concepts("Concept of Tasbih (Dhikr)", "Tasbih (Arabic: تَسْبِيح\u200E, tasbīḥ) is a form of dhikr that involves the glorification of Allah in Islam. It is often repeated a certain number of times, using either the phalanges of the right hand or a misbaha to keep track of counting......", "Concept of Tasbih (Dhikr)\n" +
                "\n" +
                "Tasbih (Arabic: تَسْبِيح\u200E, tasbīḥ) is a form of dhikr that involves the glorification of Allah in Islam. It is often repeated a certain number of times, using either the phalanges of the right hand or a misbaha to keep track of counting. The Tasbih of Fatimah (Arabic: تَسْبِيح فَاطِمَة\u200E), commonly known as \"Tasbih Hadhrat Zahra\" or \"Tasbih al-Zahra\" (Arabic: تَسْبِيح ٱلزَّهْرَاء\u200E), is a special kind of Dhikr which is attributed to Fatimah bint Muhammad PBUH. Prayer is a way to connect with Allah Almighty. Each tasbih, tahmid and takbir has 33 degrees in the universal sense. These are: \n" +
                "1) Tasbih [saying 'Subhan-Allah' (Allah is free from imperfection)] thirty-three times\n" +
                "2) Tahmid [saying 'Al-hamdu lillah' (praise be to Allah)] thirty-three times \n" +
                "3) Takbir [saying 'Allahu Akbar' (Allah is Greatest)] thirty-four times\n" +
                "and these should be recited after the conclusion of every prescribed prayer. Abu Hurairah (May Allah be pleased with him) reported:\n" +
                "\n" +
                "The Messenger of Allah (ﷺ) said, “He who recites after every prayer: Subhan-Allah (Allah is free from imperfection) thirty-three times; Al-hamdu lillah (praise be to Allah) thirty-three times; Allahu Akbar (Allah is Greatest) thirty-three times; and completes the hundred with: La ilaha illallahu, wahdahu la sharika lahu, lahul-mulku wa lahul-hamdu, wa Huwa ‘ala kulli shai’in Qadir (there is no true god except Allah. He is One and He has no partner with Him. His is the sovereignty and His is the praise, and He is Omnipotent), will have all his sins pardoned even if they may be as large as the foam on the surface of the sea.”\n" +
                "\n" +
                "The concept of tasbih came into being in an event. According to an Islamic narration from Ali ibn Abi Talib, the Prophet Muhammad PBUH taught tasbih to his beloved daughter Hazart Fatimah(RA). According to the narration, once Hazrat Fatima(RA) was tired due to daily routine. She(RA) intended to ask her father for a servant to perform chores. Prophet Muhammad (PBUH) heard of what she had to say, and so He(PBUH) went to Her house, and sat with Her, then said,\n" +
                "\"May I not direct you to something better than what you have asked for? \"\n" +
                "He(PBUH) then taught Her the mentioned tasbih and ssaid it would be better for them than a servant; Hence Hazrat Fatima(RA) was pleased. \n" +
                "In regards to this tasbih which is also famous as Tasbihat al-Sayyidah al-Zahra or Tasbihat Hazrat Fatimah al-Zahra, it is said that this is Mustahab (recommended) to say tasbih of Fatimah after every (Wajib/Mustahabb) prayers; it is also emphasized Mustahab to say this dhikr after Fajr prayer.\n" +
                "Three words, SubhanAllah, Alhamdulillah and Allahu Akbar are some of the best form of dhikr with extensive rewards that will raise your rank in the here after. In Jami At Tirmidhi hadith 3375, it says, Abdullah bin Busr (ra) narrated that: \n" +
                "A man said: “O Messenger of Allah (ﷺ), indeed, the legislated acts of Islam have become too much for me, so inform me of a thing that I should stick to.” He (ﷺ) said: “Let not your tongue cease to be moist with the remembrance of Allah.”\n" +
                "\n" +
                "And in Surah Ahzab, ayah 41 Allah gives us the command,\n" +
                "“O You who believe!  Remember Allah with much remembrance”\n" +
                "This dhikr, is potent and is said to be light on the tongue but heavy on the scale. Dhikr is a very direct and powerful way of strengthening your relationship with God, as you begin to depend on Allah for all things and not depend on other people. Allah loves the one who praises and glorifies him, and His love for you increases. It is through Allah’s love and mercy towards you that your duas are answered. This is a very special relationship that is especially experienced through this easy, pure and excellent form of worship.\n" +
                "You can increase the amount of dhikr you do by simply doing it at different times in your day, not just after salaah. For example, on your daily commutes, travelling, when you are waiting for something such as a doctor’s appointment, when you are carrying out your chores, when you have a spare ten minutes to yourself, when you are apprehensive about something (to calm your nerves) and so on.\n" +
                "\n" +
                "When you have made it a habit to do dhikr regularly in your day you will find that you feel more connected to Allah (God), which is a great feeling. This is because the act of dhikr focuses your mind continuously on Allah, much like how meditation works to block out distractions from your mind. It also has an instant calming feeling over your mind and body, and removes negative thinking from your mind. The more you practice dhikr the more you will want to do it.\n" +
                "\n" +
                "“Verily, in the remembrance of Allah do hearts find rest”\n" +
                "(Quran 13:28).\n" +
                "\n" +
                "SubhanAllah in Dhikr (Tasbih)\n" +
                "\n" +
                "The term tasbīh usually refers to the phrase: Subhān-Allāh. It is a phrase which Allāh has approved for Himself, and has inspired His angels to say, and guided the most excellent of His creation to declare. SubhanAllah is a powerful metaphor that portrays Allah as a vast ocean and utter dependence upon him for all support—like being supported by the sea. Subhanallah can also mean “May Allah be raised” or “May Allah be free of any deficiency.”\n" +
                "\n" +
                "“Or have they a deity other than Allah? Subhanallah [exalted is Allah above] whatever they associate with Him.” \n" +
                "(Surah Al-Isra 17:43)\n" +
                "\n" +
                "Typically, the term is used to marvel not at ordinary good luck or achievement but rather at the wonders of the natural world. For example, Subhanallah would be an appropriate term to use when viewing a magnificent sunset. SubhanAllah is part of a set of phrases that together make up the tasbih (prayer beads) of Fatimah. It is recited 33 times in tasbih. The command to pray in this way comes from Abu Hurayrah ad-Dawsi Alzahrani, a companion of the Prophet Muhammad (PBUH):\n" +
                "\n" +
                "\"Some poor people came to the Prophet and said, 'The wealthy people will get higher grades and will have permanent enjoyment and they pray like us and fast as we do. They have more money by which they perform the hajj, and Umra; fight and struggle in Allah's Cause and give in charity.'\" \"The Prophet said, 'Shall I not tell you a thing upon which if you acted you would catch up with those who have surpassed you? Nobody would overtake you and you would be better than the people amongst whom you live except those who would do the same. Say SubhanAllah, Alhamdulillah, and Allahu Akbar 33 times each after every [compulsory] prayer.'\" (Hadith 1:804).\n" +
                "\n" +
                "Muslims also say SubhanAllah during times of personal trial and struggle, as a \"remembrance of purpose and a refuge in the beauty of creation.\"\n" +
                "“Do the people think that they will be left to say, 'We believe,' without being put to the test? No, we have tested those before them…” (Quran 29:2-3)\n" +
                "Believing that trials in life can become long and deplete their patience, it is during these times of weakness that Muslims say SubhanAllah to help restore balance and perspective and put their minds in a different place altogether.\n" +
                "\n" +
                "Alhamdullilah in Dhikr (Tasbih)\n" +
                "\n" +
                "Alhamdulillah (pronounced “Al-Ham-Doo-Lil-Lah”) is an Arabic word. Comprehensively it means “All praise and gratitude belongs to Allah (God)”. It is a positive expression of appreciation to God for whatever happens in the life of a Muslim regardless of the situation.\n" +
                "\n" +
                "The core part of the phrase that entails praise is the Arabic term “Hamd” حَمد. However, the term “Hamd” does not only mean praise. Linguistically the word Hamd is a comprehensive term that includes praise. However it also has connotations of gratitude, veneration and appreciation along with the praise.\n" +
                "\n" +
                "The first word we read when we open the Quran is ‘Alhamdulillah’. Although Alhamdulillah is translated as “all praise to God,” it is actually an expression of gratitude. It is a way of both praising and thanking Allah (SWT) for all of our blessings.\n" +
                "\n" +
                "Gratitude is a crucial and significant aspect of the Islamic faith. But, it doesn’t stop there. Thankfulness is becoming an increasingly popular topic in modern psychology. Research is beginning to show that an attitude of gratitude cultivates happiness and wellbeing. After learning about these amazing benefits, you are certainly going to want to put in the effort to be more thankful on a daily basis.\n" +
                "\n" +
                "The Messenger of Allah (peace be upon him) said, \n" +
                "“How wonderful is the case of a believer; there is good for him in everything and this applies only to a believer. If prosperity attends him, he expresses gratitude to Allah and that is good for him; and if adversity befalls him, he endures it patiently and that is better for him”. [Sahih Muslim].\n" +
                "\n" +
                "No matter what we are going through in life. There is always something to be grateful for and praise Allah by saying Alhamdulillah. The Prophet (peace be upon him) was always so humbly grateful to Allah. He taught us that simply waking up healthy, feeling safe and having food for the day was equivalent to acquiring the whole world. Now that’s true gratitude! Something most of us do every day without even realizing what a great blessing it truly is.\n" +
                "\n" +
                "The Messenger of Allah (peace be upon him) said: ‘Whoever among you wakes up physically healthy, feeling safe and secure within himself, with food for the day, it is as if he acquired the whole world.”\n" +
                "\n" +
                "Allahu Akbar in Dhikr (Tasbih)\n" +
                "\n" +
                "The Takbir (تَكْبِير, pronounced [tak.biːr], \"magnification [of God]\") is the Arabic phrase ʾAllāhu ʾakbaru (ٱللَّٰهُ أَكْبَرُ ) meaning \"Allah (God) is the greatest\". \n" +
                "\n" +
                "It is a common Arabic expression, used in various contexts by Muslims and Arabs across the world: in formal Salah (prayer),part of Tasbih (Dhikr), in the Adhan (Islamic call to prayer), as an informal expression of faith, in times of distress or joy, or to express resolute determination or defiance.\n" +
                "\n" +
                "Allah asks us to do takbeer. He says in the Quran wakabir ho takbeera 'glorify Him with great glorification'(Surah isra 111)\n" +
                "Meaning say Allah hu Akbar -Allah is the Greatest. In a hadith we learn saying Allah hu Akbar once fills whatever is between the earth and the heavens. It means that it fills up with that much reward. Imagine! Dont understimate zikr!\n" +
                "In another hadith we learn: One who says Allah hu Akbar 100 times before sunrise and before sunset, it is better for him than freeing 100 slaves. It takes a few months, we are all awake for a bit after sehri/fajr. Do this tasbih before going back to sleep. Before aftari, you can easily say it 100 times while preparing aftar or driving or doing any chores. We already say Allah hu Akbar in our salah. In our tasbeeh after Salah. Be more conscious of what you are saying. It is sunnah to say Allah hu Akbar when ascending or climbing stairs. And imagine the reward! The space btw the earth and the heavens being filled. Even if you just have to take two steps, say Allah hu Akbar. Imagine the space between the heaven and earth being filled. Motivate yourself with the reward.\n"));
        concepts.add(new Concepts("Concept of Tawba", "Tawba (Arabic: توبة\u200E) is the Islamic concept of repenting to God due to performing any sins and misdeeds. It is a direct matter between a person and God, so there is no intercession.....", "Concept of Tawba\n" +
                "\n" +
                "Tawba (Arabic: توبة\u200E) is the Islamic concept of repenting to God due to performing any sins and misdeeds. It is a direct matter between a person and God, so there is no intercession. There is no original sin in Islam. It is the act of leaving what God has prohibited and returning to what he has commanded. The word denotes the act of being repentant for one's misdeeds, atoning for those misdeeds, and having a strong determination to forsake those misdeeds (remorse, resolution, and repentance). If someone sins against another person, restitution is required.\n" +
                "\n" +
                "Tauba means repenting for a sin, promising Allah to not repeat the same evil again and returning to Him alone. Repentance is the beginning in the life of a person who intends to walk in the path of religion. It is the first step of discipline, the key to guidance to the straight path, the weapon of purification of those who wish to come close to Allah and is a dear thing to all prophets.\n" +
                "\n" +
                "In the Quran, there is a complete surah (chapter) titled At-Tawba, which means \"The Repentance\". As with other topics, the act of atoning (for one's misdeeds) and seeking God's forgiveness has also been discussed in the Qur’an, and given much importance. For those believers who have wronged themselves, the Qur'an asks them to become repentant, seek Allah's forgiveness, and make a sincere tawba. It assures them that if they do this, God will forgive them, and exonerate them from their misdeeds.\n" +
                "And O ye Believers! turn ye all together towards God, that ye may attain Bliss.\n" +
                "— Quran, Sura 24 (Al-Noor), ayah 31\n" +
                "\n" +
                "O ye who believe! Turn to God with sincere repentance, in the hope that your Lord will remove from you your ills and admit you to Gardens beneath which Rivers flow ...\n" +
                "— Quran, Sura 66 (Al-Tahrim), ayah 08\n" +
                "\n" +
                "Surely God loves those who turn much (to Him), and He loves those who purify themselves.\n" +
                "— Quran, Sura 02 (Al-Baqara), ayah 222\n" +
                "\n" +
                "God accept the repentance of those who do evil in ignorance and repent soon afterwards; to them will God turn in mercy: For God is full of knowledge and wisdom. Of no effect is the repentance of those who continue to do evil, until death faces one of them, and he says, \"Now have I repented indeed;\" nor of those who die rejecting Faith: for them have We prepared a punishment most grievous.\n" +
                "— Quran, Sura 04 (An-Nisa), ayah 17–18\n" +
                "\n" +
                "The Qur'an also addresses the disbelievers and urges them to turn to God, upon which God promises to pardon them. The Penalty on the Day of Judgment will be doubled to him (disbeliever), and he will dwell therein in ignominy,- unless he repents, believes, and works righteous deeds, for God will change the evil of such persons into good, and God is Oft-Forgiving, Most Merciful. And whoever repents and does good has truly turned to God with an (acceptable) conversion.\n" +
                "\n" +
                "Few Advantages of Sincere Repentance or Tawbah\n" +
                "\n" +
                "1. You will be counted amoungts the best\n" +
                "The best of sinners are those who repent, and Allah loves those who keep going back to Him very often.\n" +
                "Abu Musa Al-Ash’ari (May Allah be pleased with him) reported:\n" +
                "\n" +
                "The Prophet (ﷺ) said: “Allah, the Exalted, will continue to stretch out His Hand in the night so that the sinners of the day may repent, and continue to stretch His Hand in the daytime so that the sinners of the night may repent, until the sun rises from the west”.[Muslim, Hadith 16]\n" +
                "\n" +
                "2. Allah pardons, forgives the sins of the one who repents.\n" +
                "\n" +
                "Allah says: Indeed, I am the Perpetual Forgiver of whoever repents and believes and does righteousness and then continues in guidance. Surah Ta-Ha (20:82).\n" +
                "\n" +
                "3. Allah relieves the repentant from anxiety, worries and problems.\n" +
                "\n" +
                "Ibn ‘Abbas (May Allah be pleased with them) said: The Messenger of Allah (ﷺ) said, “If anyone constantly seeks pardon (from Allah), Allah will appoint for him a way out of every distress and a relief from every anxiety and will provide sustenance for him from where he expects not.” [Abu Dawud, Hadith 1873].\n" +
                "\n" +
                "4. Allah erases the poverty; his shortage is reduced, and he is being directed to better opportunities.\n" +
                "\n" +
                "5. Allah opens the means of sustenance. Allah volumes up his livelihood and survival.\n" +
                "\n" +
                "6. Allah relieves the repentant from grieve and struggles or hurdles.\n" +
                "\n" +
                "Al-Agharr Al-Muzani (May Allah be pleased with him) said: The Messenger of Allah (ﷺ) said, “Sometimes I perceive a veil over my heart, and I supplicate Allah for forgiveness a hundred times in a day.” [Muslim, Hadith 1869].\n" +
                "\n" +
                "7. Allah removes the black spot which has been placed on the sinner’s heart after his indulgence in the sin.\n" +
                "\n" +
                "It was narrated from Abu Hurairah that the Messenger of Allah (ﷺ) said:\n" +
                "\n" +
                "When the believer commits sin, a black spot appears on his heart. If he repents and gives up that sin and seeks forgiveness, his heart will be polished. But if (the sin) increases, (the black spot) increases. That is the Ran that Allah mentions in His Book: “Nay! But on their hearts is the Ran (covering of sins and evil deeds) which they used to earn.” [Hadith 4385, 83:14]\n" +
                "\n" +
                "8. Allah increases or gives sustenance to the repentant from such places which he would have never ever thought he would get from; his sustenance is been made easy and comfortable.\n" +
                "\n" +
                "9. Allah generates gardens and flowing rivers, sends beneficial rain from the sky such is the benefits of seeking His forgiveness.\n" +
                "\n" +
                "Allah says: ‘And Nuh (A.S) said; ‘Ask forgiveness of your Lord. Indeed, He is ever a Perpetual Forgiver. He will send [rain from] the sky upon you in [continuing] showers and give you increase in wealth and children and provide for you gardens and provide for you rivers’. Surah Nuh (71:10-12)\n" +
                "\n" +
                "Anas (RAA) narrated that Allah’s Messenger (ﷺ) said: “All the sons of Adam are sinners, but the best of sinners are those who repent often.” Related by At·Tirmidhi and Ibn Majah with a strong chain of narrators. Hadith 1477\n"));
        concepts.add(new Concepts("Concept of Good and Bad Deeds", "There are those amongst us who attempt to eradicate a bad deed with a good deed, and there are those of us who genuinely repent for the bad deed and ......", "Concept of Good and Bad Deeds\n" +
                "\n" +
                "There are those amongst us who attempt to eradicate a bad deed with a good deed, and there are those of us who genuinely repent for the bad deed and carry out good deeds regardless. Good deeds come naturally to those of us who have the correct akhlaq (manners), along with increased taqwa (fear of Allah SWT). Niyyah (intention) also plays a significant role in our deeds.\n" +
                "None of us makes any loss while carrying out a noble act as this one good deed will be greatly loved by our Creator. Who knows - maybe He will forgive one of our bad deeds because of all the good deeds. The advantages of being noble far outweigh the negatives.\n" +
                "\n" +
                "The Prophet Muhammed (PBUH) has narrated that every Muslim is required to give to charity. Should that individual not have the significant means to donate in this way then they should help those who are less fortunate, and, if they are not able to do so then continuing in the performance of good deeds while keeping away from bad deeds will be considered a charitable deed.\n" +
                "\n" +
                "So, in actual fact, good deeds could go a long way in erasing bad deeds. That said it is important to remember that some bad deeds can also potentially outweigh and erase good deeds, dependent on the extent of the evil involved. Knowing which sins we may be forgiven for (or not) is not something we can foretell as only Allah SWT knows what is truly in our hearts and our intentions.\n" +
                "\n" +
                "The Almighty Allah has honored man, created him in the best form, breathed unto him from His Soul, distinguished him with reason, ordered Angels to bow down before him, subjugated everything in the universe for him, and favored him over many of His creation, as He (Glory be to Him) said, “We have honored the children of Adam and carried them by land and sea; We have provided good sustenance for them and favored them specially above many of those We have created.” This is because man has carried a heavy burden that was offered to the heavens and the earth, but they refused to carry it. It is the burden of accountability which requires work and strive, along with the development of the earth beside worshiping Allah. Allah says, “Then when the prayer has ended, disperse in the land and seek out Allah’s bounty. Remember Allah often so that you may prosper.”\n" +
                "\n" +
                "Among the good deeds that a Muslim should perform: Truthfulness, kindness, spread of peace, and other things that make people love each other. Allah says, “Tell My servants to say what is best.” \n" +
                "\n" +
                "Also, the Prophet (PBUH) said, “The dearest to me from amongst you are the best in behavior; those who are lenient, who love others and are beloved…” The Prophet showed the reality of the believer when he said, “By the One in Whose Hands rests my soul, the example of the believer is like the example of the date palm-tree; it takes what is good, gives what is good, it never harm or cause corruption.”\n" +
                "\n" +
                "Good deeds are not confined to one type of actions without another. Rather, everything that achieves human values, and contributes to building an interconnected society, purifies the soul, spreads affinity and cooperation, is a good deed. Thus, Islam makes person’s work to earn his living and the living of his children and his family a good deed that entails reward, and the Prophet (PBUH) considered it a work for the sake of Allah. Once a man passed by the Prophet and his Companions. When the Companions saw his activeness and power, they said, “Had his power was for the sake of Allah?” the Prophet (PBUH) replied, “If he is working to feed his children, then his work is for the sake of Allah. If he works to feed his old parents, then his work is for the sake of Allah. If he works to earn his living lawfully, then his work is for the sake of Allah. If, however, he went out to show off, then his work is for the sake of the Satan.”\n" +
                "\n" +
                "Just as good deeds are rewarded, wrongdoers will be punished in this world and the life to come. The list of punishment includes misguidance, confusion and unrest. Allah, Most High, says: “What! Is he whose evil deed is made fair-seeming to him so much so that he considers it good? Now surely Allah makes err whom He pleases and guides aright whom He pleases, so let not your soul waste away in grief for them; surely Allah is Cognizant of what they do” and “And whoever turns away from My reminder, his shall be a straitened life, and We will raise him on the day of resurrection, blind.”\n" +
                "They will also face bas destiny in the Hereafter; Allah, Glorified is He, says: “(As for) those who swallow the property of the orphans unjustly, surely they only swallow fire into their bellies and they shall enter burning fires.” Prophet Muhammad (PBUH) said, “Any person who takes a piece of land unjustly will sink down the seven earths on the Day of Resurrection.”\n" +
                "As such, we are in a dire need to cling to all what is beneficial to us and to keep away from any harm and evil. Besides, we should cooperate with and advise one another to do the right “I swear by the time, \n" +
                "(1) Most surely man is in loss, \n" +
                "(2) Except those who believe and do good, and enjoin on each other truth, and enjoin on each other patience. \n" +
                "(3)\"O Allah! We ask You to do good; keep away from bad deeds; love the needy; provide us with us sincerity and acceptance and protect Egypt and all the world’s countries from any evil!\n"));
        concepts.add(new Concepts("","",""));

        recyclerViewAdapter = new RecyclerViewAdapter2(Concepts_frag.this,concepts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.hasFixedSize();
        recyclerView.setAdapter(new RecyclerViewAdapter2(concepts));

        return view;
    }
}