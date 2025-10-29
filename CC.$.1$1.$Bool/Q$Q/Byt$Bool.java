package CC.$.Q$Q;

import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.Collection;

public interface Byt$Bool
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Byt$Bool.class,
		Clas_Rap.class);
	/*Dep ?done*/


	@Lin_DclAr
	boolean Byt$Bool(byte In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Bytg$Boolg(
			byte[] From,
			boolean[] To)
		{
			for(int Indx=0;
				Indx<From.length;
				Indx+=1)
			{
				To[Indx]=(Byt$Bool(
				From[Indx]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default boolean[] Bytg$Boolg(byte[] In)
			{
				boolean[] Out=new boolean[In.length];
				Bytg$Boolg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Bytg$Boolg(
			Iterable<Byte> From,
			Collection<Boolean> To)
		{
			for(byte In:From)
			{To.add(Byt$Bool(In));}
		}
}