package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.Collection;
//import CC.Encycloped.Abs.Org.Syc.TXt.Cond.String_IndX_To_Bool;

public interface ChR$Bool //extends String_IndX_To_Bool
{
	/*
	Clas_Rap Class=Init_StRt_Nd(ChR$Bool.class,
		Clas_Rap.class);
	/*Dep done*/

	@Lin_DclAr
	boolean ChR$Bool(char In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void ChRg$Boolg(
			char[] From,
			boolean[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(ChR$Bool(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default boolean[] ChRg$Boolg(char[] In)
			{
				boolean[] Out=new boolean[In.length];
				ChRg$Boolg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void ChRg$Boolg(
			Iterable<Character> From,
			Collection<Boolean> To)
		{
			for(char In:From)
			{To.add(ChR$Bool(In));}
		}

		static <C_I extends ChR$Bool>boolean To_Bool(String String,int IndX,C_I[] List)
		{
			if(String.length()<IndX+List.length)
			{
				for(ChR$Bool Is:List)
				{
					if(!Is.ChR$Bool(String.charAt(IndX)))
					{return false;}
					IndX+=1;
				}
				return true;
			}
			else
			{
				return false;
			}
		}
//		@Override
		default boolean String_IndX$Bool(String TXt,int IndX)
		{return ChR$Bool(TXt.charAt(IndX));}
}