package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
import org.jetbrains.annotations.NotNull;

import static CC.List.ArA_Util.New_ArA;
import static CC.List.ArA_Util.To_ArA;
import CC.Util.Prim.Int_Havr;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public interface Point$Bool<Q$q_Typ>
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Point_Bool.class,Clas_Rap.class,
								Bool_Set.class,
								Collection.class,
								Iterable.class);/*Dep done*/

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	boolean Point$Bool(Q$q_Typ Object);
		default <Typ_2 extends Q$q_Typ>void Filtr(@NotNull Typ_2[] From,Collection<Typ_2> To)
		{
			for(Typ_2 Item:From)
			{
				if(Point$Bool(Item))
				{To.add(Item);}
			}
		}
			default <Typ_2 extends Q$q_Typ>ArrayList<Typ_2> Filtr(Typ_2[] From)
			{
				ArrayList<Typ_2> To=new ArrayList<>();

				Filtr(From,To);

				return To;
			}
//			default <Typ_2 extends Q$q_Typ>Typ_2[] Filtr_Ara(Typ_2[] From)
//			{return ArA_Util.To_ArA(Filtr(From),(Class<Typ_2>)From.getClass().getComponentType());}
			default <Typ_2 extends Q$q_Typ>void Filtr_Ara(Typ_2[] From,Typ_2[] To)
			{
				int IndX=0;
				for(Typ_2 Item:From)
				{
					if(Point$Bool(Item))
					{To[IndX]=Item;}
				}
			}
			default <Typ_2 extends Q$q_Typ>Typ_2[] Filtr_Ara_P(Typ_2[] From)
			{
				Typ_2[] To=null;//ArA_Util.New_ArA((Class<Typ_2>)From.getClass().getComponentType(),Count(From));
				Filtr_Ara(From,To);

				return To;
			}
		default <Typ_2 extends Q$q_Typ>void Filtr(Iterable<Typ_2> From,Collection<Typ_2> To)
		{
			for(Typ_2 Item:From)
			{
				if(Point$Bool(Item))
				{To.add(Item);}
			}
		}
			default <Typ_2 extends Q$q_Typ>ArrayList<Typ_2> Filtr(Collection<Typ_2> From)
			{
				ArrayList<Typ_2> To=new ArrayList<>();

				Filtr(From,To);

				return To;
			}
//			default <Typ_2 extends Q$q_Typ>void Filtr_Ara(Collection<Typ_2> From,Class<Typ_2> Typ)
//			{ArA_Util.To_ArA(Filtr(From),Typ);}
		default int Count(Q$q_Typ[] List)
		{
			int Count=0;
			for(Q$q_Typ Item:List)
			{
				if(Point$Bool(Item))
				{Count+=1;}
			}

			return Count;
		}
		default <P extends Q$q_Typ>int Count(Iterable<P> List)
		{
			int Count=0;
			for(P Item:List)
			{
				if(Point$Bool(Item))
				{Count+=1;}
			}

			return Count;
		}
		default int Count_Seq(List<Q$q_Typ> List,Int_Havr IndX)
		{
			for(int Count=0;;
				Count+=1,IndX.Int_Ad(1))
			{
				if(!(
					IndX.$Int()<List.size()&&
					Point$Bool(List.get(IndX.$Int()))))
				{return Count;}
			}
		}
		default int Count_Seq(Q$q_Typ[] List,Int_Havr IndX)
		{
			for(int Count=0;;
				Count+=1,IndX.Int_Ad(1))
			{
				if(!(IndX.$Int()<List.length&&Point$Bool(List[IndX.$Int()])))
				{return Count;}
			}
		}
		default int Sek(Q$q_Typ[] List,int IndX,int Nd)
		{
			for(;IndX<Nd
				;IndX+=1)
			{
				if(Point$Bool(List[IndX]))
				{return IndX;}
			}
			return -1;
		}
			default int Sek_StRt(Q$q_Typ[] List,int IndX)
			{return Sek(List,IndX,List.length);}
			default int Sek_Nd(Q$q_Typ[] List,int Nd)
			{return Sek(List,0,Nd);}
			default int Sek(Q$q_Typ[] List)
			{return Sek_StRt(List,0);}
		default int Sek_R(Q$q_Typ[] List,int IndX,int Nd)
		{
			for(;IndX<Nd
				;IndX-=1)
			{
				if(Point$Bool(List[IndX]))
				{return IndX;}
			}
			return -1;
		}
			default int Sek_StRt_R(Q$q_Typ[] List,int IndX)
			{return Sek_R(List,IndX,List.length);}
			default int Sek_Nd_R(Q$q_Typ[] List,int Nd)
			{return Sek_R(List,0,Nd);}
			default int Sek_R(Q$q_Typ[] List)
			{return Sek_StRt_R(List,0);}
	default boolean Contan(Iterable<Q$q_Typ> List)
	{
		for(Q$q_Typ Item:List)
		{
			if(Point$Bool(Item))
			{return true;}
		}
		return false;
	}
	default boolean Contan(Q$q_Typ[] List)
	{
		for(Q$q_Typ Item:List)
		{
			if(Point$Bool(Item))
			{return true;}
		}
		return false;
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default <In extends Q$q_Typ>void Pointg$Boolg(
			In[] From,
			boolean[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=Point$Bool(
				From[IndX]);
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default <In extends Q$q_Typ>boolean[] Pointg$Boolg(In[] From)
			{
				boolean[] Out=new boolean[From.length];
				Pointg$Boolg(From,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default <In extends Q$q_Typ>void Pointg$Boolg(
			Iterable<In> From,
			Collection<Boolean> To)
		{
			for(In In:From)
			{To.add(Point$Bool(In));}
		}

	Point$Bool
		Of=(Object)->{return false;},
		On=(Object)->{return true;};
}