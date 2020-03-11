export class Personne {

    private static _idCurrent:number=0;
    private _id: number=Personne._idCurrent;
    private _email: string="bruce.wayne@wayne-enterprise.com";
    private _nom: string="Wayne";
    private _prenom: string="Bruce";
    private _dateDeNaissance: string="10/12/1495";
    private _mdp: string="MotDePasse";
    private _profil: string="Admin";

    //constructeur
    constructor () {
        this._id = Personne._idCurrent; 
        Personne._idCurrent+=1;
    }

    //accesseurs
    public get id(): number {
        return this._id;
    }
    public set id(value: number) {
        this._id = value;
    }

    public get email(): string {
        return this._email;
    }
    public set email(value: string) {
        this._email = value;
    }

    public get nom(): string {
        return this._nom;
    }
    public set nom(value: string) {
        this._nom = value;
    }

    public get prenom(): string {
        return this._prenom;
    }
    public set prenom(value: string) {
        this._prenom = value;
    }

    public get dateDeNaissance(): string {
        return this._dateDeNaissance;
    }
    public set dateDeNaissance(value: string) {
        this._dateDeNaissance = value;
    }

    public get mdp(): string {
        return this._mdp;
    }
    public set mdp(value: string) {
        this._mdp = value;
    }

    public get profil(): string {
        return this._profil;
    }
    public set profil(value: string) {
        this._profil = value;
    }
}
