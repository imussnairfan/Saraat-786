package com.example.project_saraat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Supplications_frag extends Fragment {

    RecyclerView recyclerView;
    List<Model_Suplications> saraat;


    public Supplications_frag() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_supplications_frag, container, false);
        recyclerView = view.findViewById(R.id.rv_supplications);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new Supplications_adapter(func()));
        return view;
    }

    private List<Model_Suplications> func() {
        saraat = new ArrayList<>();
        saraat.add(new Model_Suplications("Waking Up", "الحَمْـدُ لِلّهِ الّذي أَحْـيانا بَعْـدَ ما أَماتَـنا وَإليه النُّـشور\n" +
                "\nAll praise is for Allah who gave us life after having taken it from us and unto Him is the resurrection.\n"));
        saraat.add(new Model_Suplications(" When Wearing \nClothes", "الحمدُ للهِ الّذي كَساني هذا (الثّوب) وَرَزَقَنيه مِنْ غَـيـْرِ حَولٍ مِنّي وَلا قـوّة\n" +
                "All Praise is for Allah who has clothed me with this garment and provided it for me, with no power nor might from myself.\n"));
        saraat.add(new Model_Suplications("Before Undressing", "بِسْمِ الله\n" +
                "In the name of Allah.\n"));
        saraat.add(new Model_Suplications("Before Entering \nthe Toilet", "بِسْمِ الله – اللّهُـمَّ إِنِّـي أَعـوذُ بِـكَ مِـنَ الْخُـبْثِ وَالْخَبائِث\n" +
                "In the name of Allah. O Allah, I take refuge with you from all evil and evil-doers.\n"));
        saraat.add(new Model_Suplications("After Leaving \nthe Toilet", "غُفْـرانَك\n" +
                "I ask You (Allah) for forgiveness.\n"));
        saraat.add(new Model_Suplications("When Exiting \nthe House", "بِسْمِ اللهِ ، تَوَكَّلْـتُ عَلى اللهِ وَلا حَوْلَ وَلا قُـوَّةَ إِلاّ بِالله\n" +
                "In the name of Allah, I place my trust in Allah, and there is no might nor power except with Allah.\n"));
        saraat.add(new Model_Suplications("When Entering \nthe House", "بِسْـمِ اللهِ وَلَجْنـا، وَبِسْـمِ اللهِ خَـرَجْنـا، وَعَلـى رَبِّنـا تَوَكّلْـنا\n" +
                "In the name of Allah we enter and in the name of Allah we leave, and upon our Lord we place our trust.\n"));
        saraat.add(new Model_Suplications("When Going to \nthe Mosque", "اللّهُـمَّ اجْعَـلْ في قَلْبـي نورا ، وَفي لِسـاني نورا، وَاجْعَـلْ في سَمْعي نورا، وَاجْعَـلْ في بَصَري نورا، وَاجْعَـلْ مِنْ خَلْفي نورا، وَمِنْ أَمامـي نورا، وَاجْعَـلْ مِنْ فَوْقـي نورا ، وَمِن تَحْتـي نورا .اللّهُـمَّ أَعْطِنـي نورا\n" +
                "O Allah, place within my heart light, and upon my tongue light, and within my ears light, and within my eyes light, and place behind me light and in front of me light and above me light and beneath me light. O Allah, bestow upon me light.\n"));
        saraat.add(new Model_Suplications("When Entering \nthe Mosque", "اعوذُ باللهِ العَظيـم وَبِوَجْهِـهِ الكَرِيـم وَسُلْطـانِه القَديـم مِنَ الشّيْـطانِ الرَّجـيم، بِسْـمِ الله، وَالصَّلاةُ وَالسَّلامُ عَلى رَسولِ الله، اللّهُـمَّ افْتَـحْ لي أَبْوابَ رَحْمَتـِك\n" +
                "I take refuge with Allah, The Supreme and with His Noble Face, and His eternal authority from the accursed devil. In the name of Allah, and prayers and peace be upon the Messenger of Allah. O Allah, open the gates of Your mercy for me.\n"));
        saraat.add(new Model_Suplications("When Exiting \nthe Mosque", "بِسمِ الله وَالصّلاةُ وَالسّلامُ عَلى رَسولِ الله، اللّهُـمَّ إِنّـي أَسْأَلُكَ مِـنْ فَضْـلِك، اللّهُـمَّ اعصِمْنـي مِنَ الشَّيْـطانِ الرَّجـيم\n" +
                "In the name of Allah, and prayers and peace be upon the Messenger of Allah. O Allah, I ask You from Your favor. O Allah, guard me from the accursed devil.\n"));
        saraat.add(new Model_Suplications("After Completing \nthe Ablution (Wudu)", "أَشْهَـدُ أَنْ لا إِلَـهَ إِلاّ اللهُ وَحْدَهُ لا شَريـكَ لَـهُ وَأَشْهَدُ أَنَّ مُحَمّـداً عَبْـدُهُ وَرَسـولُـه. اللّهُـمَّ اجْعَلنـي مِنَ التَّـوّابينَ وَاجْعَـلْني مِنَ المتَطَهّـرين\n" +
                "I bear witness that none has the right to be worshipped except Allah, alone without partner, and I bear witness that Muhammad is His slave and Messenger. O Allah, make me of those who return to You often in repentance and make me of those who remain clean and pure\n"));
        saraat.add(new Model_Suplications("After the \nAdhan \n(Call to Prayer)", "اللّهُـمَّ رَبَّ هَذِهِ الدّعْـوَةِ التّـامَّة وَالصّلاةِ القَـائِمَة آتِ محَـمَّداً الوَسيـلةَ وَالْفَضـيلَة وَابْعَـثْه مَقـامـاً مَحـموداً الَّذي وَعَـدْتَه إِنَّـكَ لا تُـخْلِفُ الميـعاد\n" +
                "O Allah, Owner of this perfect call and Owner of this prayer to be performed, bestow upon Muhammad al-waseelah and al-fadeelah and send him upon a praised platform which You have promised him. Verily, You never fail in Your promise.’\n"));
        saraat.add(new Model_Suplications("After the End \nof an Obligatory \nPrayer (Fardh)", "There are many supplications mentioned in the sunnah to be read after the obligatory prayer.\n" +
                "\n" +
                "لا إلهَ إلاّ اللّهُ وحدَهُ لا شريكَ لهُ، لهُ المُـلْكُ ولهُ الحَمْد، وهوَ على كلّ شَيءٍ قَدير، اللّهُـمَّ لا مانِعَ لِما أَعْطَـيْت، وَلا مُعْطِـيَ لِما مَنَـعْت، وَلا يَنْفَـعُ ذا الجَـدِّ مِنْـكَ الجَـد\n" +
                "None has the right to be worshipped except Allah, alone, without partner, to Him belongs all sovereignty and praise and He is over all things omnipotent.O Allah, none can prevent what You have willed to bestow and none can bestow what You have willed to prevent, and no wealth or majesty can benefit anyone, as from You is all wealth and majesty.\n" +
                "\n" +
                "Following is read only following the Fajr prayer after ending the prayer with salam:\n" +
                "\n" +
                "اللّهُـمَّ إِنِّـي أَسْأَلُـكَ عِلْمـاً نافِعـاً وَرِزْقـاً طَيِّـباً ، وَعَمَـلاً مُتَقَـبَّلاً\n" +
                "O Allah, I ask You for knowledge which is beneficial and sustenance which is good, and deeds which are acceptable\n"));
        saraat.add(new Model_Suplications("For Seeking \nGuidance After \nForming a \nDecision (Istikhara)", "On the authority of Jabir Ibn Abdullah: The Prophet (pbuh) would instruct us to pray for guidance in all of our concerns, just as he would teach us a chapter from the Qur’an. He (pbuh) would say, If any of you intends to undertake a matter then let him pray two supererogatory units (two rakah nafl) of prayer and after which he should supplicate:\n" +
                "\n" +
                "اللّهُـمَّ إِنِّـي أَسْتَخيـرُكَ بِعِاْـمِك، وَأسْتَقْـدِرُكَ بِقُـدْرَتِـك، وَأَسْـألُـكَ مِنْ فَضْـلِكَ العَظـيم، فَإِنَّـكَ تَقْـدِرُ وَلا أَقْـدِر، وَتَـعْلَـمُ وَلا أَعْلَـم، وَأَنْـتَ عَلاّمُ الغُـيوب، اللّهُـمَّ إِنْ كُنْـتَ تَعْـلَمُ أَنَّ هـذا الأمْـرَ- وَيُسَـمِّي حاجَتَـه – خَـيْرٌ لي في دينـي وَمَعـاشي وَعاقِـبَةِ أَمْـري، فَاقْـدُرْهُ لي وَيَسِّـرْهُ لي ثـمَّ بارِكْ لي فيـه، وَإِنْ كُنْـتَ تَعْـلَمُ أَنَّ هـذا الأمْـرَ شَـرٌ لي في دينـي وَمَعـاشي وَعاقِـبَةِ أَمْـري، فَاصْرِفْـهُ وَاصْرِفْني عَنْـهُ وَاقْـدُرْ لي الخَـيْرَ حَيْـثُ كانَ ثُـمَّ أَرْضِـني بِـه\n" +
                "O Allah, I seek Your counsel by Your knowledge and by Your power I seek strength and I ask You from Your immense favour, for verily You are able while I am not and verily You know while I do not and You are the Knower of the unseen. O Allah, if You know this affair -and here he mentions his need- to be good for me in relation to my religion, my life, and end, then decree and facilitate it for me, and bless me with it, and if You know this affair to be ill for me towards my religion, my life, and end, then remove it from me and remove me from it, and decree for me what is good wherever it be and make me satisfied with such.\n" +
                "\n" +
                "One who seeks guidance from his Creator and consults his fellow believers and then remains firm in his resolve does not regret, for Allah has said:\n" +
                "\n" +
                "And consult them in the affair. Then when you have taken a decision, put your trust in Allah. [Qur’an 3:159]\n"));
        saraat.add(new Model_Suplications("Remembrance in \nthe Morning \nand Evening", "The following supplications are very important and are a form of protection for the believer from the evil eye, evil jinns/men, black magic, etc. The morning time is generally accepted to be between dawn and sunrise, however, there is disagreement among Muslim scholars as to what it means by evening. It is generally held to be between Asr and Maghrib prayers.\n" +
                "\n" +
                "There are many supplications for this category, but I am choosing only four. However, I encourage everyone to know and memorize them all due to their immense benefit and blessing.\n" +
                "\n" +
                "Dua 1\n" +
                "\n" +
                "أَمْسَيْـنا وَأَمْسـى المـلكُ لله وَالحَمدُ لله ، لا إلهَ إلاّ اللّهُ وَحدَهُ لا شَريكَ لهُ، لهُ المُـلكُ ولهُ الحَمْـد، وهُوَ على كلّ شَيءٍ قدير ، رَبِّ أسْـأَلُـكَ خَـيرَ ما في هـذهِ اللَّـيْلَةِ وَخَـيرَ ما بَعْـدَهـا ، وَأَعـوذُ بِكَ مِنْ شَـرِّ هـذهِ اللَّـيْلةِ وَشَرِّ ما بَعْـدَهـا ، رَبِّ أَعـوذُبِكَ مِنَ الْكَسَـلِ وَسـوءِ الْكِـبَر ، رَبِّ أَعـوذُبِكَ مِنْ عَـذابٍ في النّـارِ وَعَـذابٍ في القَـبْر\n" +
                "We have reached the evening and at this very time unto Allah belongs all sovereignty, and all praise is for Allah. None has the right to be worshipped except Allah, alone, without partner, to Him belongs all sovereignty and praise and He is over all things omnipotent. My Lord, I ask You for the good of this night and the good of what follows it and I take refuge in You from the evil of this night and the evil of what follows it. My Lord, I take refuge in You from laziness and senility. My Lord, I take refuge in You from torment in the Fire and punishment in the grave.\n" +
                "\n" +
                "If it’s the morning, then same as above except that the person begins with:\n" +
                "\n" +
                "أَصْـبَحْنا وَأَصْـبَحَ المُـلْكُ لله instead of أَمْسَيْـنا وَأَمْسـى المـلكُ لله\n" +
                "\n" +
                "Dua 2\n" +
                "\n" +
                "If morning:\n" +
                "\n" +
                "اللّهُـمَّ بِكَ أَصْـبَحْنا وَبِكَ أَمْسَـينا ، وَبِكَ نَحْـيا وَبِكَ نَمـوتُ وَإِلَـيْكَ النِّـشور\n" +
                "O Allah, by your leave we have reached the morning and by Your leave we have reached the evening, by Your leave we live and die and unto You is our resurrection\n" +
                "\n" +
                "If evening:\n" +
                "\n" +
                "اللّهُـمَّ بِكَ أَمْسَـينا، وَبِكَ أَصْـبَحْنا، وَبِكَ نَحْـيا، وَبِكَ نَمـوتُ وَإِلَـيْكَ المَصـير\n" +
                "O Allah, by Your leave we have reached the evening and by Your leave we have reached the morning, by Your leave we live and die and unto You is our return.\n" +
                "\n" +
                "اللّهـمَّ أَنْتَ رَبِّـي لا إلهَ إلاّ أَنْتَ ، خَلَقْتَنـي وَأَنا عَبْـدُك ، وَأَنا عَلـى عَهْـدِكَ وَوَعْـدِكَ ما اسْتَـطَعْـت ، أَعـوذُبِكَ مِنْ شَـرِّ ما صَنَـعْت ، أَبـوءُ لَـكَ بِنِعْـمَتِـكَ عَلَـيَّ وَأَبـوءُ بِذَنْـبي فَاغْفـِرْ لي فَإِنَّـهُ لا يَغْـفِرُ الذُّنـوبَ إِلاّ أَنْتَ\n" +
                "Dua 3\n" +
                "\n" +
                "This is one of the most powerful supplications for seeking forgiveness. It is referred to as Sayyid Al-Istighfar (leader of the supplications for forgiveness). The Prophet Muhammad (pbuh) said about it that if somebody recites it during the day with firm faith in it, and dies on the same day before the evening, he will be from the people of Paradise; and if somebody recites it at night with firm faith in it, and dies before the morning, he will be from the people of Paradise.\n" +
                "\n" +
                "اللّهـمَّ أَنْتَ رَبِّـي لا إلهَ إلاّ أَنْتَ ، خَلَقْتَنـي وَأَنا عَبْـدُك ، وَأَنا عَلـى عَهْـدِكَ وَوَعْـدِكَ ما اسْتَـطَعْـت ، أَعـوذُبِكَ مِنْ شَـرِّ ما صَنَـعْت ، أَبـوءُ لَـكَ بِنِعْـمَتِـكَ عَلَـيَّ وَأَبـوءُ بِذَنْـبي فَاغْفـِرْ لي فَإِنَّـهُ لا يَغْـفِرُ الذُّنـوبَ إِلاّ أَنْتَ\n" +
                "O Allah, You are my Lord, none has the right to be worshipped except You, You created me and I am Your servant and I abide to Your covenant and promise as best I can, I take refuge in You from the evil of which I have committed. I acknowledge Your favor upon me and I acknowledge my sin, so forgive me, for verily none can forgive sin except You.\n" +
                "\n" +
                "Dua 4\n" +
                "\n" +
                "The following is to be said three times in the morning and evening. It is one of the best forms of protection. Prophet Muhammad (pbuh) said that whoever says it three times in the morning will not suffer sudden affliction till the evening, and whoever says it three times in the evening will not suffer sudden affliction till the morning:\n" +
                "\n" +
                "بِسـمِ اللهِ الذي لا يَضُـرُّ مَعَ اسمِـهِ شَيءٌ في الأرْضِ وَلا في السّمـاءِ وَهـوَ السّمـيعُ العَلـيم\n" +
                "In the name of Allah with whose name nothing is harmed on earth nor in the heavens and He is The All-Seeing, The All-Knowing\n"));
        saraat.add(new Model_Suplications("Before Sleeping", "There are many supplications in this category as well but I am presenting just three:\n" +
                "\n" +
                "بِاسْمِكَ اللَّهمَّ أَمُوْتُ وَأَحْيَا\n" +
                "In Your name O Allah, I live and die.\n" +
                "\n" +
                "اللَّهمَّ إِنَّكَ خَلَقْتَ نَفْسِي وَأَنْتَ تَوَفَّاهَا لَكَ مَمَاتُهَا وَمَحْيَاهَا، إِنْ أَحْيَيْتَهَا فَاحْفَظْهَا، وَإِنْ أَمَتَّهَا فَاغْفِرْ لَهَا. اللَّهمَّ إِنِّي أَسْأَلُكَ العَافِيَةَ\n" +
                "O Allah, verily You have created my soul and You shall take it’s life, to You belongs it’s life and death. If You should keep my soul alive then protect it, and if You should take it’s life then forgive it. O Allah, I ask You to grant me good health.\n" +
                "\n" +
                "The Prophet (S) would place his right hand under his cheek when about to sleep and would say three times:\n" +
                "\n" +
                "اللَّهمَّ قِنِي عَذَابَكَ يَوْمَ تَبْعَثُ عِبَادَكَ\n" +
                "O Allah, save me from your punishment on the day you resurrect your servants.\n"));
        saraat.add(new Model_Suplications("When Experiencing \nUnrest, Fear, \nApprehensiveness \nDuring Sleep", "أَعُوْذُ بِكَلِمَاتِ اللَّهِ التَّامَّاتِ مِنْ غَضَبِه ِِ وَعِقَابِهِ، وَشَرِّ عِبَادِه ِِ وَمِنْ هَمَزَاتِ الشَّيْاطِيْنِ وَأَنْ يَحْضُرُوْنَ\n" +
                "I take refuge in the perfect words of Allah from His anger and punishment, and from the evil of His servants, and from the madness and appearance of devils.\n"));
        saraat.add(new Model_Suplications("After Seeing \na Bad Dream", "The Prophet Muhammad (pbuh) taught us to take the following steps after waking up from a nightmare:\n" +
                "\n" +
                "Dry spit on your left side three times\n" +
                "Seek refuge in Allah from the Shaytan and from what you saw three times\n" +
                "Do not tell anyone about it\n" +
                "Sleep on the opposite side from which you were sleeping when you had the nightmare\n" +
                "19 – For Anxiety and Sorrow\n" +
                "اللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الهَمِّ وَالحُزْنِ، وَالعَجْزِ وَالكَسَلِ وَالبُخْلِ وَالجُبْنِ، وَضَلْعِ الدَّيْنِ وَغَلَبَةِ الرِّجَالِ\n" +
                "‘O Allah, I take refuge in You from anxiety and sorrow, weakness and laziness, miserliness and cowardice, the burden of debts and from being over powered by men.’\n"));
        saraat.add(new Model_Suplications("One in \nDistress", "ا إِلَهََ إِلاَّ اللهُ العَظِيْمُ الحَلِيْمُ، لا إِلَهََ إِلاَّ اللهُ رَبُّ العَرْشِ العَظِيْمِ، لا إِلَهَ~َ إِلاَّ اللهُ رَبُّ السَّمَوَاتِ وَرَبُّ الأَرْضِ وَرَبُّ العَرْشِ الكَرِيْمِ\n" +
                "None has the right to be worshipped except Allah Forbearing. None has the right to be worshipped except Allah, Lord of the magnificent throne. None has the right to be worshipped except Allah, Lord of the heavens, Lord of the Earth and Lord of the noble throne.\n"));
        saraat.add(new Model_Suplications("One Afflicted \nwith Doubt in Faith", "آمَنْتُ بِاللهِ وَرُسُلِهِ\n" +
                "I have believed in Allah and His Messenger\n" +
                "\n" +
                "هُوَ الأَوَّلُ وَالآخِرُ وَالظَّاهِرُ وَالبَاطِنُ وَهُوَ بِكُلِّ شَيءٍ عَلِيْمٌ\n" +
                "He is The First and The Last, The Evident and The Imminent and He has full knowledge of all things\n"));
        saraat.add(new Model_Suplications("For Settling \na Debt", "Ali narrated that the Prophet Muhammad (pbuh) taught him the following supplication that if you had a debt upon you similar to the mountain of Sir, Allah would fulfill it for you:\n" +
                "\n" +
                "اللَّهمَّ اكْفِنِي بِحَلالِكَ عَنْ حَرَامِكَ، وَأَغْنِنِي بِفَضْلِكَ عَمَّنْ سِوَاكَ\n" +
                "‘O Allah, make what is lawful enough for me, as opposed to what is unlawful, and spare me by Your grace, of need of others.’\n" +
                "\n" +
                "It is reported that the Prophet Muhammad (pbuh) also used to make the following supplication often. It may be useful so that we do not fall into heavy debt in the first place:\n" +
                "\n" +
                "اللَّهمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الهَمِّ وَالحُزْنِ، وَالعَجْزِ وَالكَسَلِ وَالبُخْلِ وَالجُبْنِ، وَضَلْعِ الدَّيْنِ وَغَلَبَةِ الرِّجَالِ\n" +
                "O Allah, I take refuge in You from anxiety and sorrow, weakness and laziness, miserliness and cowardice, the burden of debts and from being over powered by men\n"));
        saraat.add(new Model_Suplications("For One Whose \nAffairs Have \nBecome Difficult", "اللَّهمَّ لا سَهْلَ إِلاَّ مَا جَعَلتَه ُُ سَهْلا، ً وَأَنْتَ تَجْعَلُ الحَزَنَ إِذَا شِئْتَ سَهْلا\n" +
                "O Allah, there is no ease except in that which You have made easy, and You make the difficulty, if You wish, easy.\n"));
        saraat.add(new Model_Suplications("Placing \nChildren \nUnder Allah’s \nProtection", "It is reported that the Prophet Muhammad (pbuh) used invoke the following supplication for Al-Hassan and Al-Hussain and stated that Ibrahim (pbuh) used to say this very same supplication for his sons Ismail and Ishaq.\n" +
                "\n" +
                "أُعِيْذُكُمَا بِكَلِمَاتِ اللَّهِ التَّامَّةِ، مِنْ كُلِّ شَيْطَان ٍ وَهَامَّة، ٍ وَمِنْ كُلِّ عَيْن ٍ لامَّة\n" +
                "I seek refuge for both of you in the perfect words of Allah from every devil, poisonous thing, and every evil eye\n"));
        saraat.add(new Model_Suplications("When Stricken \nwith a Mishap \nor Overtaken \nby an Affair", "حَسْبِيَ اللَّهُ وَنِعْمَ الوَكِيْلُ\n" +
                "Allah is sufficient for me, and how fine a trustee (He is).\n"));
        saraat.add(new Model_Suplications("When Visiting \na Sick Person", "The following supplication is to be said seven times when visiting a sick person.\n" +
                "\n" +
                "أَسْأَلُ اللَّهَ العَظِيْمَ، رَبَّ العَرْشِ العَظِيْمِ أَنْ يَشْفِيْكَ\n" +
                "I ask Allah The Supreme, Lord of the magnificent throne to cure you.\n"));
        saraat.add(new Model_Suplications("One Afflicted \nBy a Calamity", "إِنَّا للهِ وَإِنَّا إِلَيْهِ رَاجِعُوْنَ، اللَّهمَّ أْجُرْنِي فِي مُصِيْبَتِي، وَاخْلُفْ لِي خَيْرا ً مِنْهَا\n" +
                "To Allah we belong and unto Him is our return.O Allah, recompense me for my affliction and replace it for me with something better.\n"));
        saraat.add(new Model_Suplications("Supplication \nfor the \nDeceased During \nthe Funeral Prayer", "There are many different supplications reported. The following is perhaps the most popular.\n" +
                "\n" +
                "اللَّهمَّ اغْفِرْ لِحَيِّنَا وَمَيِّتِنَا وَشَاهِدِنَا، وَغَائِبِنَا، وَصَغِيْرِنَا وَكَبِيْرِنَا، وَذَكَرِنَا وَأُنْثَانَا. اللَّهمَّ مَنْ أَحْيَيْتَه ُُ مِنَّا فَأَحْيِه ِِ عَلَى الإِسْلامِ، وَمَنْ تَوَفَّيْتَه ُُ مِنَّا فَتَوَفَّه ُُ عَلَى الإِيْمَانِ، اللَّهمَّ لا تَحْرِمْنَا أَجْرَهُ، وَلا تُضِلَّنَا بَعْدَهُ\n" +
                "O Allah, forgive our living and our dead, those present and those absent, our young and our old, our males and our females. O Allah, whom among us You keep alive, then let such a life be upon Islam, and whom among us You take unto Yourself, then let such a death be upon faith. O Allah, do not deprive us of his reward and do not let us stray after him\n" +
                "\n" +
                "Some people find them too long to remember because funerals do not happen often enough so people forget especially in the West. In that case, you can just memorize the following and just repeat it over and over again during the funeral:\n" +
                "\n" +
                "اللَّهمَّ اغْفِرْ لَه ُُ وَارْحَمْهُ\n" +
                "O Allah, forgive him and have mercy on him\n"));
        saraat.add(new Model_Suplications("Visiting the \nCemetery", "السَّلامُ عَلَيْكُمْ أَهْلَ الدِّيَارِ مِنَ المُؤْمِنِيْنَ وَالمُسْلِمِيْنَ، وَإِنَّا إِنْ شَاءَ اللَّهُ بِكُمْ لاحِقُوْنَ، نَسْأَلُ اللَّهَ لَنَا وَلَكُمُ العَافِيَةَ\n" +
                "Peace be upon you all, O inhabitants of the graves, among the believers and the Muslims. Verily we will, Allah willing, be united with you, we ask Allah for well-being for us and you.\n"));
        saraat.add(new Model_Suplications("During a \nWindstorm", "اللَّهمَّ إِنِّي أَسْأَلُكَ خَيْرَهَا، وَأَعُوْذُ بِكَ مِنْ شَرِّهَا\n" +
                "‘O Allah, I ask You for it’s goodness and I take refuge with You from it’s evil.’\n"));
        saraat.add(new Model_Suplications("When It Rains", "اللَّهُمَّ اجْعَلْهُ صَيِّبًا نَافِعًا\n" +
                "O Allah, may it be a beneficial rain cloud.\n"));
        saraat.add(new Model_Suplications("On Breaking \nthe Fast", "ذَهَبَ الظَّمَأُ وَابْتَلَّتِ الْعُرُوقُ وَثَبَتَ الأَجْرُ إِنْ شَاءَ اللَّهُ\n" +
                "The thirst has gone and the veins are quenched, and reward is confirmed, if Allah wills.\n"));
        saraat.add(new Model_Suplications("Before Eating", "بِسْمِ اللَّهِ\n" +
                "In the Name of Allah\n" +
                "\n" +
                "If you forget and remember in the middle of eating, then say:\n" +
                "\n" +
                "بِسْمِ اللَّهِ فِي أَوَّلِه ِِ وَآخِرِهِ\n" +
                "In the name of Allah in it’s beginning and end.\n"));
        saraat.add(new Model_Suplications("After Eating", "الحَمْدُ للهِ الَّذِي أَطْعَمَنِي هَذَا وَرَزَقَنِيْهِ مِنْ غَيْرِ حَوْل ٍ مِنِّي وَلا قُوَّة\n" +
                "All praise is for Allah who fed me this and provided it for me without any might nor power from myself.\n"));
        saraat.add(new Model_Suplications("Supplication \nfor the Host", "If you’re ever invited to a gathering and provided food, then you should make the following supplication for the host:\n" +
                "\n" +
                "اللَّهمَّ بَارِكْ لَهُمْ فِيْمَا رَزَقْتَهُمْ، وَاغْفِرْ لَهُمْ وَارْحَمْهُمْ\n" +
                "O Allah, bless for them, that which You have provided them, forgive them and have mercy upon them.\n"));
        saraat.add(new Model_Suplications("Before Sexual \nIntercourse with \nOne’s Wife/Husband", "بِسْمِ اللَّهِ اللَّهمَّ جَنِّبْنَا الشَّيْطَانَ، وَجَنِّبِ الشَّيْطَانَ مَا رَزَقْتَنَا\n" +
                "In the name of Allah. O Allah, keep the devil away from us and keep the devil away from what you have blessed us with.\n"));
        saraat.add(new Model_Suplications("When Angry", "أَعُوْذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيْمِ\n" +
                "I take refuge with Allah from the accursed devil\n"));
        saraat.add(new Model_Suplications("Groom’s \nSupplication \non the \nWedding Night", "It is reported that the groom should take hold of her forelock and say:\n" +
                "\n" +
                "اللَّهمَّ إِنِّي أَسْأَلُكَ خَيْرَهَا، وَخَيْرَ مَا جَبَلْتَهَا عَلَيْهِ، وَأَعُوْذُ بِكَ مِنْ شَرِّهَا، وَشَرِّ مَا جَبَلْتَهَا عَلَيْهِ\n" +
                "O Allah, I ask You for the goodness within her and the goodness that you have made her inclined towards, and I take refuge with You from the evil within her and the evil that you have made her inclined towards\n"));
        saraat.add(new Model_Suplications("To the One \nWho Does \nYou a Favor", "جَزَاكَ اللَّهُ خَيْرا\n" +
                "May Allah reward you with goodness\n"));
        saraat.add(new Model_Suplications("Fear of Shirk", "Falling into shirk (polytheism) is the fundamental greatest sin before Allah. It is one of the main reasons that prophets were sent. There is not hardly a page in the Qur’an where Allah does not remind the believers of His Oneness and warn them against associating partners with Him in worship or any other way or form. A Muslim must always take heed and assure that he/she is not falling into it in any way. The following supplication is one of the ways to protect yourself:\n" +
                "\n" +
                "اللّهُـمَّ إِنّـي أَعـوذُبِكَ أَنْ أُشْـرِكَ بِكَ وَأَنا أَعْـلَمْ، وَأَسْتَـغْفِرُكَ لِما لا أَعْـلَم\n" +
                "O Allah, I take refuge in You lest I should commit shirk with You knowingly and I seek Your forgiveness for what I do unknowingly\n"));
        saraat.add(new Model_Suplications("Stopping or \nLodging \nSomewhere", "Next time you arrive in a different city and need to stop, say the following:\n" +
                "\n" +
                "أَعـوذُ بِكَلِـماتِ اللّهِ التّـامّاتِ مِنْ شَـرِّ ما خَلَـق\n" +
                "I take refuge in Allah’s perfect words from the evil that He has created\n"));
        saraat.add(new Model_Suplications("When in Fear \nof a People", "اللَّهُمَّ اكْفِنِيهِمْ بِما شِئْتَ\n" +
                "O Allah, protect me from them with what You choose.\n"));
        saraat.add(new Model_Suplications("After Sneezing", "الحَمْدُ للهِ\n" +
                "All praise is for Allah\n" +
                "\n" +
                "The listener should then respond to the one who sneezed by saying:\n" +
                "يَرْحَمُكَ اللَّهُ\n" +
                "May Allah have mercy upon you\n" +
                "\n" +
                "Then the one who sneezed should respond:\n" +
                "يَهْدِيْكُمُ اللَّهُ وَيُصْلِحُ بَالَكُمْ\n" +
                "May Allah guide you and rectify your condition\n"));
        saraat.add(new Model_Suplications("Pain in Some \nPart of the Body", "It is reported to place your hand at the site of the pain and say three times:\n" +
                "بِسْمِ اللهِ\n" +
                "In the Name of Allah\n" +
                "\n" +
                "Then say seven times:\n" +
                " أَعُوذُ باللهِ وَقُدْرَتِهِ مَنْ شَرِّ مَا أَجِدُ وَأُحَاذِرُ\n" +
                "I seek refuge in the might and power of Allah from the evil of what I feel and what I fear\n"));
        saraat.add(new Model_Suplications("Breaking Fast \nin Someone’s \nHome", "Say the following supplication when breaking fast in someone’s home:\n" +
                "\n" +
                "أَفْطَرَ عِنْدَكُمُ الصَّائِمُوْنَ وَأَكَلَ طَعَامَكُمُ الأَبْرَارُ، وَصَلَّتْ عَلَيْكُمُ المَلائِكَةُ\n" +
                "May the fasting break their fast in your home, and may the dutiful and pious eat your food, and may the angels send prayers upon you\n"));
        saraat.add(new Model_Suplications("", ""));
        saraat.add(new Model_Suplications("", ""));
        return saraat;
    }
}