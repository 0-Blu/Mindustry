package mindustry.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.*;

public class Blocks{
    public static Block

    //environment
    air, spawn, cliff, deepwater, water, taintedWater, deepTaintedWater, tar, slag, cryofluid, stone, craters, charr, sand, darksand, dirt, mud, ice, snow, darksandTaintedWater, space, empty,
    dacite, rhyolite, rhyoliteCrater, regolith, yellowStone, redIce,
    arkyciteFloor, arkyicStone,
    redmat, bluemat,
    stoneWall, dirtWall, sporeWall, iceWall, daciteWall, sporePine, snowPine, pine, shrubs, whiteTree, whiteTreeDead, sporeCluster,
    redweed, purbush, coralChunk, yellowCoral,
    regolithWall, yellowStoneWall, rhyoliteWall, steamVent, carbonWall, redIceWall, ferricStoneWall, beryllicStoneWall,
    ferricStone, ferricCraters, carbonStone, beryllicStone,
    iceSnow, sandWater, darksandWater, duneWall, sandWall, moss, sporeMoss, shale, shaleWall, grass, salt,
    shaleBoulder, sandBoulder, daciteBoulder, boulder, snowBoulder, basaltBoulder, carbonBoulder, ferricBoulder, beryllicBoulder, yellowStoneBoulder,
    metalFloor, metalFloorDamaged, metalFloor2, metalFloor3, metalFloor4, metalFloor5, basalt, magmarock, hotrock, snowWall, saltWall,
    darkPanel1, darkPanel2, darkPanel3, darkPanel4, darkPanel5, darkPanel6, darkMetal,
    pebbles, tendrils,

    //ores
    oreCopper, oreLead, oreScrap, oreCoal, oreTitanium, oreThorium,
    oreTungsten,

    //wall ores
    wallOreBeryl, graphiticWall,

    //crafting
    siliconSmelter, siliconCrucible, kiln, graphitePress, plastaniumCompressor, multiPress, phaseWeaver, surgeSmelter, pyratiteMixer, blastMixer, cryofluidMixer,
    melter, separator, disassembler, sporePress, pulverizer, incinerator, coalCentrifuge,

    //erekir
    siliconArcFurnace, electrolyzer, oxidationChamber, atmosphericConcentrator, slagHeater, slagIncinerator, heatReactor,
    carbideCrucible, slagCentrifuge, surgeCrucible, cyanogenSynthesizer, phaseSynthesizer,
    cellSynthesisChamber,

    //sandbox
    powerSource, powerVoid, itemSource, itemVoid, liquidSource, liquidVoid, payloadSource, payloadVoid, illuminator,

    //defense
    copperWall, copperWallLarge, titaniumWall, titaniumWallLarge, plastaniumWall, plastaniumWallLarge, thoriumWall, thoriumWallLarge, door, doorLarge,
    phaseWall, phaseWallLarge, surgeWall, surgeWallLarge, mender, mendProjector, overdriveProjector, overdriveDome, forceProjector, shockMine,
    buildTower,
    scrapWall, scrapWallLarge, scrapWallHuge, scrapWallGigantic, thruster, //ok, these names are getting ridiculous, but at least I don't have humongous walls yet

    //transport
    conveyor, titaniumConveyor, plastaniumConveyor, armoredConveyor, distributor, junction, itemBridge, phaseConveyor, sorter, invertedSorter, router,
    overflowGate, underflowGate, massDriver,

    //transport - alternate
    duct, ductRouter, overflowDuct, ductBridge, ductUnloader,
    surgeConveyor, surgeRouter,

    unitCargoLoader, unitCargoUnloadPoint,

    //liquid
    mechanicalPump, rotaryPump, impulsePump, conduit, pulseConduit, platedConduit, liquidRouter, liquidContainer, liquidTank, liquidJunction, bridgeConduit, phaseConduit,

    //liquid - reinforced
    reinforcedPump, reinforcedConduit, reinforcedLiquidJunction, reinforcedBridgeConduit, reinforcedLiquidRouter, reinforcedLiquidContainer, reinforcedLiquidTank,

    //power
    combustionGenerator, thermalGenerator, steamGenerator, differentialGenerator, rtgGenerator, solarPanel, largeSolarPanel, thoriumReactor,
    impactReactor, battery, batteryLarge, powerNode, powerNodeLarge, surgeTower, diode,

    //power - erekir
    //TODO rename chemicalCombustionChamber
    turbineCondenser, chemicalCombustionChamber, pyrolysisGenerator,
    beamNode, beamTower,

    //production
    mechanicalDrill, pneumaticDrill, laserDrill, blastDrill, waterExtractor, oilExtractor, cultivator,
    cliffCrusher, plasmaBore, largePlasmaBore, impactDrill,

    //storage
    coreShard, coreFoundation, /*TODO core foundation is a bad name, rename to fragment */ coreNucleus, vault, container, unloader,
    //storage - erekir
    coreBastion, coreCitadel, coreAcropolis, reinforcedContainer, reinforcedVault,

    //turrets
    duo, scatter, scorch, hail, arc, wave, lancer, swarmer, salvo, fuse, ripple, cyclone, foreshadow, spectre, meltdown, segment, parallax, tsunami,

    //turrets - erekir
    breach, fracture, sublimate,

    //units
    commandCenter,
    groundFactory, airFactory, navalFactory,
    additiveReconstructor, multiplicativeReconstructor, exponentialReconstructor, tetrativeReconstructor,
    repairPoint, repairTurret,

    //payloads
    payloadConveyor, payloadRouter, payloadPropulsionTower, deconstructor, constructor, largeConstructor, payloadLoader, payloadUnloader,

    //logic
    message, switchBlock, microProcessor, logicProcessor, hyperProcessor, largeLogicDisplay, logicDisplay, memoryCell, memoryBank,

    //campaign
    launchPad, interplanetaryAccelerator

    ;

    /** @deprecated use the blocks with proper names */
    @Deprecated
    public static Block blockForge, blockLoader, blockUnloader;

    public static void load(){
        //region environment

        air = new AirBlock("air");

        spawn = new SpawnBlock("spawn");

        cliff = new Cliff("cliff"){{
            inEditor = false;
            saveData = true;
        }};

        //Registers build blocks
        //no reference is needed here since they can be looked up by name later
        for(int i = 1; i <= Vars.maxBlockSize; i++){
            new ConstructBlock(i);
        }

        deepwater = new Floor("deep-water"){{
            speedMultiplier = 0.2f;
            variants = 0;
            liquidDrop = Liquids.water;
            liquidMultiplier = 1.5f;
            isLiquid = true;
            status = StatusEffects.wet;
            statusDuration = 120f;
            drownTime = 200f;
            cacheLayer = CacheLayer.water;
            albedo = 0.9f;
        }};

        water = new Floor("shallow-water"){{
            speedMultiplier = 0.5f;
            variants = 0;
            status = StatusEffects.wet;
            statusDuration = 90f;
            liquidDrop = Liquids.water;
            isLiquid = true;
            cacheLayer = CacheLayer.water;
            albedo = 0.9f;
        }};

        taintedWater = new Floor("tainted-water"){{
            speedMultiplier = 0.5f;
            variants = 0;
            status = StatusEffects.wet;
            statusDuration = 90f;
            liquidDrop = Liquids.water;
            isLiquid = true;
            cacheLayer = CacheLayer.water;
            albedo = 0.9f;
            attributes.set(Attribute.spores, 0.15f);
        }};

        deepTaintedWater = new Floor("deep-tainted-water"){{
            speedMultiplier = 0.18f;
            variants = 0;
            status = StatusEffects.wet;
            statusDuration = 140f;
            drownTime = 200f;
            liquidDrop = Liquids.water;
            isLiquid = true;
            cacheLayer = CacheLayer.water;
            albedo = 0.9f;
            attributes.set(Attribute.spores, 0.15f);
        }};

        darksandTaintedWater = new ShallowLiquid("darksand-tainted-water"){{
            speedMultiplier = 0.75f;
            statusDuration = 60f;
            albedo = 0.9f;
            attributes.set(Attribute.spores, 0.1f);
        }};

        sandWater = new ShallowLiquid("sand-water"){{
            speedMultiplier = 0.8f;
            statusDuration = 50f;
            albedo = 0.9f;
        }};

        darksandWater = new ShallowLiquid("darksand-water"){{
            speedMultiplier = 0.8f;
            statusDuration = 50f;
            albedo = 0.9f;
        }};

        tar = new Floor("tar"){{
            drownTime = 230f;
            status = StatusEffects.tarred;
            statusDuration = 240f;
            speedMultiplier = 0.19f;
            variants = 0;
            liquidDrop = Liquids.oil;
            isLiquid = true;
            cacheLayer = CacheLayer.tar;
        }};

        cryofluid = new Floor("pooled-cryofluid"){{
            drownTime = 150f;
            status = StatusEffects.freezing;
            statusDuration = 240f;
            speedMultiplier = 0.5f;
            variants = 0;
            liquidDrop = Liquids.cryofluid;
            liquidMultiplier = 0.5f;
            isLiquid = true;
            cacheLayer = CacheLayer.cryofluid;

            emitLight = true;
            lightRadius = 25f;
            lightColor = Color.cyan.cpy().a(0.19f);
        }};

        slag = new Floor("molten-slag"){{
            drownTime = 230f;
            status = StatusEffects.melting;
            statusDuration = 240f;
            speedMultiplier = 0.19f;
            variants = 0;
            liquidDrop = Liquids.slag;
            isLiquid = true;
            cacheLayer = CacheLayer.slag;
            attributes.set(Attribute.heat, 0.85f);

            emitLight = true;
            lightRadius = 40f;
            lightColor = Color.orange.cpy().a(0.38f);
        }};

        space = new Floor("space"){{
            cacheLayer = CacheLayer.space;
            placeableOn = false;
            solid = true;
            variants = 0;
            canShadow = false;
        }};

        empty = new EmptyFloor("empty");

        stone = new Floor("stone");

        craters = new Floor("crater-stone"){{
            variants = 3;
            blendGroup = stone;
        }};

        charr = new Floor("char"){{
            blendGroup = stone;
        }};

        basalt = new Floor("basalt"){{
            attributes.set(Attribute.water, -0.25f);
        }};

        hotrock = new Floor("hotrock"){{
            attributes.set(Attribute.heat, 0.5f);
            attributes.set(Attribute.water, -0.5f);
            blendGroup = basalt;

            emitLight = true;
            lightRadius = 30f;
            lightColor = Color.orange.cpy().a(0.15f);
        }};

        magmarock = new Floor("magmarock"){{
            attributes.set(Attribute.heat, 0.75f);
            attributes.set(Attribute.water, -0.75f);
            blendGroup = basalt;

            emitLight = true;
            lightRadius = 50f;
            lightColor = Color.orange.cpy().a(0.3f);
        }};

        sand = new Floor("sand"){{
            itemDrop = Items.sand;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 0.7f);
        }};

        darksand = new Floor("darksand"){{
            itemDrop = Items.sand;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 1.5f);
        }};

        dirt = new Floor("dirt");

        mud = new Floor("mud"){{
            speedMultiplier = 0.6f;
            variants = 3;
            status = StatusEffects.muddy;
            statusDuration = 30f;
            attributes.set(Attribute.water, 1f);
            cacheLayer = CacheLayer.mud;
            walkSound = Sounds.mud;
            walkSoundVolume = 0.08f;
            walkSoundPitchMin = 0.4f;
            walkSoundPitchMax = 0.5f;
        }};

        ((ShallowLiquid)darksandTaintedWater).set(Blocks.taintedWater, Blocks.darksand);
        ((ShallowLiquid)sandWater).set(Blocks.water, Blocks.sand);
        ((ShallowLiquid)darksandWater).set(Blocks.water, Blocks.darksand);

        dacite = new Floor("dacite");

        rhyolite = new Floor("rhyolite"){{
            attributes.set(Attribute.water, -1f);
        }};

        rhyoliteCrater = new Floor("rhyolite-crater"){{
            attributes.set(Attribute.water, -1f);
            blendGroup = rhyolite;
        }};

        steamVent = new SteamVent("steam-vent"){{
            parent = blendGroup = rhyolite;
            attributes.set(Attribute.vent, 1f);
        }};

        regolith = new Floor("regolith"){{
            attributes.set(Attribute.water, -1f);
        }};

        yellowStone = new Floor("yellow-stone"){{
            attributes.set(Attribute.water, -1f);
        }};

        carbonStone = new Floor("carbon-stone"){{
            attributes.set(Attribute.water, -1f);
            variants = 4;
        }};

        ferricStone = new Floor("ferric-stone"){{
            attributes.set(Attribute.water, -1f);
        }};

        ferricCraters = new Floor("ferric-craters"){{
            variants = 3;
            attributes.set(Attribute.water, -1f);
            blendGroup = ferricStone;
        }};

        beryllicStone = new Floor("beryllic-stone"){{
            variants = 4;
        }};

        redIce = new Floor("red-ice"){{
            //TODO red ice boulder
            dragMultiplier = 0.4f;
            speedMultiplier = 0.9f;
            attributes.set(Attribute.water, 0.4f);
        }};

        arkyciteFloor = new Floor("arkycite-floor"){{
            speedMultiplier = 0.3f;
            variants = 0;
            liquidDrop = Liquids.arkycite;
            liquidMultiplier = 1.5f;
            isLiquid = true;
            //TODO status, cache layer for this crap
            status = StatusEffects.wet;
            statusDuration = 120f;
            drownTime = 200f;
            cacheLayer = CacheLayer.arkycite;
            albedo = 0.9f;
        }};

       arkyicStone = new Floor("arkyic-stone"){{
            variants = 3;
        }};

        redmat = new Floor("redmat");
        bluemat = new Floor("bluemat");

        grass = new Floor("grass"){{
            //TODO grass needs a bush? classic had grass bushes.
            attributes.set(Attribute.water, 0.1f);
        }};

        salt = new Floor("salt"){{
            variants = 0;
            attributes.set(Attribute.water, -0.3f);
            attributes.set(Attribute.oil, 0.3f);
        }};

        snow = new Floor("snow"){{
            attributes.set(Attribute.water, 0.2f);
            albedo = 0.7f;
        }};

        ice = new Floor("ice"){{
            dragMultiplier = 0.35f;
            speedMultiplier = 0.9f;
            attributes.set(Attribute.water, 0.4f);
            albedo = 0.65f;
        }};

        iceSnow = new Floor("ice-snow"){{
            dragMultiplier = 0.6f;
            variants = 3;
            attributes.set(Attribute.water, 0.3f);
            albedo = 0.6f;
        }};

        shale = new Floor("shale"){{
            variants = 3;
            attributes.set(Attribute.oil, 1.6f);
        }};

        moss = new Floor("moss"){{
            variants = 3;
            attributes.set(Attribute.spores, 0.15f);
        }};

        sporeMoss = new Floor("spore-moss"){{
            variants = 3;
            attributes.set(Attribute.spores, 0.3f);
        }};

        stoneWall = new StaticWall("stone-wall"){{
            attributes.set(Attribute.silicate, 1f);
        }};

        sporeWall = new StaticWall("spore-wall"){{
            taintedWater.asFloor().wall = deepTaintedWater.asFloor().wall = sporeMoss.asFloor().wall = this;
        }};

        dirtWall = new StaticWall("dirt-wall");

        daciteWall = new StaticWall("dacite-wall");

        iceWall = new StaticWall("ice-wall"){{
            iceSnow.asFloor().wall = this;
            albedo = 0.6f;
        }};

        snowWall = new StaticWall("snow-wall");

        duneWall = new StaticWall("dune-wall"){{
            basalt.asFloor().wall = darksandWater.asFloor().wall = darksandTaintedWater.asFloor().wall = this;
            attributes.set(Attribute.silicate, 2f);
        }};

        regolithWall = new StaticWall("regolith-wall"){{
            regolith.asFloor().wall = this;
            attributes.set(Attribute.silicate, 1f);
        }};

        yellowStoneWall = new StaticWall("yellow-stone-wall"){{
            yellowStone.asFloor().wall = slag.asFloor().wall = this;
            attributes.set(Attribute.silicate, 1.5f);
        }};

        rhyoliteWall = new StaticWall("rhyolite-wall"){{
            rhyolite.asFloor().wall = rhyoliteCrater.asFloor().wall = this;
            attributes.set(Attribute.silicate, 1f);
        }};

        carbonWall = new StaticWall("carbon-wall"){{
            carbonStone.asFloor().wall = this;
            attributes.set(Attribute.silicate, 0.7f);
        }};

        ferricStoneWall = new StaticWall("ferric-stone-wall"){{
            ferricStone.asFloor().wall = this;
            attributes.set(Attribute.silicate, 0.5f);
        }};

        beryllicStoneWall = new StaticWall("beryllic-stone-wall"){{
            beryllicStone.asFloor().wall = this;
            attributes.set(Attribute.silicate, 1.2f);
        }};

        redIceWall = new StaticWall("red-ice-wall"){{
            redIce.asFloor().wall = this;
        }};

        sandWall = new StaticWall("sand-wall"){{
            sandWater.asFloor().wall = water.asFloor().wall = deepwater.asFloor().wall = this;
            attributes.set(Attribute.silicate, 2f);
        }};

        saltWall = new StaticWall("salt-wall");

        shrubs = new StaticWall("shrubs");

        shaleWall = new StaticWall("shale-wall");

        sporePine = new StaticTree("spore-pine"){{
            moss.asFloor().wall = this;
        }};

        snowPine = new StaticTree("snow-pine");

        pine = new StaticTree("pine");

        whiteTreeDead = new TreeBlock("white-tree-dead");

        whiteTree = new TreeBlock("white-tree");

        sporeCluster = new Prop("spore-cluster"){{
            variants = 3;
            breakSound = Sounds.plantBreak;
        }};

        redweed = new Seaweed("redweed"){{
            variants = 3;
            redmat.asFloor().decoration = this;
        }};

        purbush = new SeaBush("pur-bush"){{
            bluemat.asFloor().decoration = this;
        }};

        yellowCoral = new SeaBush("yellowcoral"){{
            lobesMin = 2;
            lobesMax = 3;
            magMax = 8f;
            magMin = 2f;
            origin = 0.3f;
            spread = 40f;
            sclMin = 60f;
            sclMax = 100f;
        }};

        coralChunk = new StaticCoralWall("coralchunk"){{

        }};

        boulder = new Prop("boulder"){{
            variants = 2;
            stone.asFloor().decoration = craters.asFloor().decoration = charr.asFloor().decoration = this;
        }};

        snowBoulder = new Prop("snow-boulder"){{
            variants = 2;
            snow.asFloor().decoration = ice.asFloor().decoration = iceSnow.asFloor().decoration = salt.asFloor().decoration = this;
        }};

        shaleBoulder = new Prop("shale-boulder"){{
            variants = 2;
            shale.asFloor().decoration = this;
        }};

        sandBoulder = new Prop("sand-boulder"){{
            variants = 2;
            sand.asFloor().decoration = this;
        }};

        daciteBoulder = new Prop("dacite-boulder"){{
            variants = 2;
            dacite.asFloor().decoration = this;
        }};

        basaltBoulder = new Prop("basalt-boulder"){{
            variants = 2;
            basalt.asFloor().decoration = hotrock.asFloor().decoration = darksand.asFloor().decoration = magmarock.asFloor().decoration = this;
        }};

        carbonBoulder = new Prop("carbon-boulder"){{
            variants = 2;
            carbonStone.asFloor().decoration = this;
        }};

        ferricBoulder = new Prop("ferric-boulder"){{
            variants = 2;
            ferricStone.asFloor().decoration = ferricCraters.asFloor().decoration = this;
        }};

        beryllicBoulder = new Prop("beryllic-boulder"){{
            variants = 2;
            beryllicStone.asFloor().decoration = this;
        }};

        yellowStoneBoulder = new Prop("yellow-stone-boulder"){{
            variants = 2;
            yellowStone.asFloor().decoration = this;
        }};

        metalFloor = new Floor("metal-floor", 0);
        metalFloorDamaged = new Floor("metal-floor-damaged", 3);

        metalFloor2 = new Floor("metal-floor-2", 0);
        metalFloor3 = new Floor("metal-floor-3", 0);
        metalFloor4 = new Floor("metal-floor-4", 0);
        metalFloor5 = new Floor("metal-floor-5", 0);

        darkPanel1 = new Floor("dark-panel-1", 0);
        darkPanel2 = new Floor("dark-panel-2", 0);
        darkPanel3 = new Floor("dark-panel-3", 0);
        darkPanel4 = new Floor("dark-panel-4", 0);
        darkPanel5 = new Floor("dark-panel-5", 0);
        darkPanel6 = new Floor("dark-panel-6", 0);

        darkMetal = new StaticWall("dark-metal");

        Seq.with(metalFloor, metalFloorDamaged, metalFloor2, metalFloor3, metalFloor4, metalFloor5, darkPanel1, darkPanel2, darkPanel3, darkPanel4, darkPanel5, darkPanel6)
        .each(b -> b.asFloor().wall = darkMetal);

        pebbles = new OverlayFloor("pebbles");

        tendrils = new OverlayFloor("tendrils");

        //endregion
        //region ore

        oreCopper = new OreBlock(Items.copper){{
            oreDefault = true;
            oreThreshold = 0.81f;
            oreScale = 23.47619f;
        }};

        oreLead = new OreBlock(Items.lead){{
            oreDefault = true;
            oreThreshold = 0.828f;
            oreScale = 23.952381f;
        }};

        oreScrap = new OreBlock(Items.scrap);

        oreCoal = new OreBlock(Items.coal){{
            oreDefault = true;
            oreThreshold = 0.846f;
            oreScale = 24.428572f;
        }};

        oreTitanium = new OreBlock(Items.titanium){{
            oreDefault = true;
            oreThreshold = 0.864f;
            oreScale = 24.904762f;
        }};

        oreThorium = new OreBlock(Items.thorium){{
            oreDefault = true;
            oreThreshold = 0.882f;
            oreScale = 25.380953f;
        }};

        oreTungsten = new OreBlock(Items.tungsten);

        //endregion
        //region wall ore

        wallOreBeryl = new WallOreBlock(Items.beryllium);

        graphiticWall = new StaticWall("graphitic-wall"){{
            itemDrop = Items.graphite;
            variants = 3;
        }};

        //endregion
        //region crafting

        graphitePress = new GenericCrafter("graphite-press"){{
            requirements(Category.crafting, with(Items.copper, 75, Items.lead, 30));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(Items.graphite, 1);
            craftTime = 90f;
            size = 2;
            hasItems = true;

            consumes.item(Items.coal, 2);
        }};

        multiPress = new GenericCrafter("multi-press"){{
            requirements(Category.crafting, with(Items.titanium, 100, Items.silicon, 25, Items.lead, 100, Items.graphite, 50));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(Items.graphite, 2);
            craftTime = 30f;
            itemCapacity = 20;
            size = 3;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;

            consumes.power(1.8f);
            consumes.item(Items.coal, 3);
            consumes.liquid(Liquids.water, 0.1f);
        }};

        siliconSmelter = new GenericCrafter("silicon-smelter"){{
            requirements(Category.crafting, with(Items.copper, 30, Items.lead, 25));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.silicon, 1);
            craftTime = 40f;
            size = 2;
            hasPower = true;
            hasLiquids = false;
            drawer = new DrawSmelter(Color.valueOf("ffef99"));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            consumes.items(with(Items.coal, 1, Items.sand, 2));
            consumes.power(0.50f);
        }};

        siliconCrucible = new AttributeCrafter("silicon-crucible"){{
            requirements(Category.crafting, with(Items.titanium, 120, Items.metaglass, 80, Items.plastanium, 35, Items.silicon, 60));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.silicon, 8);
            craftTime = 90f;
            size = 3;
            hasPower = true;
            hasLiquids = false;
            itemCapacity = 30;
            boostScale = 0.15f;
            drawer = new DrawSmelter(Color.valueOf("ffef99"));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            consumes.items(with(Items.coal, 4, Items.sand, 6, Items.pyratite, 1));
            consumes.power(4f);
        }};

        siliconArcFurnace = new GenericCrafter("silicon-arc-furnace"){{
            requirements(Category.crafting, with(Items.beryllium, 60, Items.graphite, 80));
            craftEffect = Fx.none;
            outputItem = new ItemStack(Items.silicon, 5);
            craftTime = 40f;
            size = 3;
            hasPower = true;
            hasLiquids = false;
            envEnabled |= Env.space | Env.underwater;
            envDisabled = Env.none;
            itemCapacity = 30;
            drawer = new DrawArcSmelter();

            consumes.items(with(Items.graphite, 1, Items.sand, 4));
            consumes.power(6f);
        }};

        kiln = new GenericCrafter("kiln"){{
            requirements(Category.crafting, with(Items.copper, 60, Items.graphite, 30, Items.lead, 30));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.metaglass, 1);
            craftTime = 30f;
            size = 2;
            hasPower = hasItems = true;
            drawer = new DrawSmelter(Color.valueOf("ffc099"));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            consumes.items(with(Items.lead, 1, Items.sand, 1));
            consumes.power(0.60f);
        }};

        plastaniumCompressor = new GenericCrafter("plastanium-compressor"){{
            requirements(Category.crafting, with(Items.silicon, 80, Items.lead, 115, Items.graphite, 60, Items.titanium, 80));
            hasItems = true;
            liquidCapacity = 60f;
            craftTime = 60f;
            outputItem = new ItemStack(Items.plastanium, 1);
            size = 2;
            health = 320;
            hasPower = hasLiquids = true;
            craftEffect = Fx.formsmoke;
            updateEffect = Fx.plasticburn;
            drawer = new DrawGlow();

            consumes.liquid(Liquids.oil, 0.25f);
            consumes.power(3f);
            consumes.item(Items.titanium, 2);
        }};

        phaseWeaver = new GenericCrafter("phase-weaver"){{
            requirements(Category.crafting, with(Items.silicon, 130, Items.lead, 120, Items.thorium, 75));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.phaseFabric, 1);
            craftTime = 120f;
            size = 2;
            hasPower = true;
            drawer = new DrawWeave();

            ambientSound = Sounds.techloop;
            ambientSoundVolume = 0.02f;

            consumes.items(with(Items.thorium, 4, Items.sand, 10));
            consumes.power(5f);
            itemCapacity = 20;
        }};

        surgeSmelter = new GenericCrafter("surge-smelter"){{
            requirements(Category.crafting, with(Items.silicon, 80, Items.lead, 80, Items.thorium, 70));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.surgeAlloy, 1);
            craftTime = 75f;
            size = 3;
            hasPower = true;
            itemCapacity = 20;
            drawer = new DrawSmelter();

            consumes.power(4f);
            consumes.items(with(Items.copper, 3, Items.lead, 4, Items.titanium, 2, Items.silicon, 3));
        }};

        cryofluidMixer = new LiquidConverter("cryofluid-mixer"){{
            requirements(Category.crafting, with(Items.lead, 65, Items.silicon, 40, Items.titanium, 60));
            outputLiquid = new LiquidStack(Liquids.cryofluid, 0.2f);
            craftTime = 120f;
            size = 2;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;
            outputsLiquid = true;
            envEnabled = Env.any;
            drawer = new DrawMixer(true);

            consumes.power(1f);
            consumes.item(Items.titanium);
            consumes.liquid(Liquids.water, 0.2f);
        }};

        pyratiteMixer = new GenericCrafter("pyratite-mixer"){{
            requirements(Category.crafting, with(Items.copper, 50, Items.lead, 25));
            hasItems = true;
            hasPower = true;
            outputItem = new ItemStack(Items.pyratite, 1);
            envEnabled |= Env.space;

            size = 2;

            consumes.power(0.20f);
            consumes.items(with(Items.coal, 1, Items.lead, 2, Items.sand, 2));
        }};

        blastMixer = new GenericCrafter("blast-mixer"){{
            requirements(Category.crafting, with(Items.lead, 30, Items.titanium, 20));
            hasItems = true;
            hasPower = true;
            outputItem = new ItemStack(Items.blastCompound, 1);
            size = 2;
            envEnabled |= Env.space;

            consumes.items(with(Items.pyratite, 1, Items.sporePod, 1));
            consumes.power(0.40f);
        }};

        melter = new GenericCrafter("melter"){{
            requirements(Category.crafting, with(Items.copper, 30, Items.lead, 35, Items.graphite, 45));
            health = 200;
            outputLiquid = new LiquidStack(Liquids.slag, 2f);
            craftTime = 10f;
            hasLiquids = hasPower = true;
            drawer = new DrawLiquid();

            consumes.power(1f);
            consumes.item(Items.scrap, 1);
        }};

        separator = new Separator("separator"){{
            requirements(Category.crafting, with(Items.copper, 30, Items.titanium, 25));
            results = with(
                Items.copper, 5,
                Items.lead, 3,
                Items.graphite, 2,
                Items.titanium, 2
            );
            hasPower = true;
            craftTime = 35f;
            size = 2;

            consumes.power(1.1f);
            consumes.liquid(Liquids.slag, 4f / 60f);
        }};

        disassembler = new Separator("disassembler"){{
            requirements(Category.crafting, with(Items.plastanium, 40, Items.titanium, 100, Items.silicon, 150, Items.thorium, 80));
            results = with(
                Items.sand, 2,
                Items.graphite, 1,
                Items.titanium, 1,
                Items.thorium, 1
            );
            hasPower = true;
            craftTime = 15f;
            size = 3;
            itemCapacity = 20;

            consumes.power(4f);
            consumes.item(Items.scrap);
            consumes.liquid(Liquids.slag, 0.12f);
        }};

        sporePress = new GenericCrafter("spore-press"){{
            requirements(Category.crafting, with(Items.lead, 35, Items.silicon, 30));
            liquidCapacity = 60f;
            craftTime = 20f;
            outputLiquid = new LiquidStack(Liquids.oil, 6f);
            size = 2;
            health = 320;
            hasLiquids = true;
            hasPower = true;
            craftEffect = Fx.none;
            drawer = new DrawAnimation();

            consumes.item(Items.sporePod, 1);
            consumes.power(0.7f);
        }};

        pulverizer = new GenericCrafter("pulverizer"){{
            requirements(Category.crafting, with(Items.copper, 30, Items.lead, 25));
            outputItem = new ItemStack(Items.sand, 1);
            craftEffect = Fx.pulverize;
            craftTime = 40f;
            updateEffect = Fx.pulverizeSmall;
            hasItems = hasPower = true;
            drawer = new DrawRotator(){{
                drawSpinSprite = true;
            }};
            ambientSound = Sounds.grinding;
            ambientSoundVolume = 0.025f;

            consumes.item(Items.scrap, 1);
            consumes.power(0.50f);
        }};

        coalCentrifuge = new GenericCrafter("coal-centrifuge"){{
            requirements(Category.crafting, with(Items.titanium, 20, Items.graphite, 40, Items.lead, 30));
            craftEffect = Fx.coalSmeltsmoke;
            outputItem = new ItemStack(Items.coal, 1);
            craftTime = 30f;
            size = 2;
            hasPower = hasItems = hasLiquids = true;
            rotateDraw = false;

            consumes.liquid(Liquids.oil, 0.1f);
            consumes.power(0.7f);
        }};

        incinerator = new Incinerator("incinerator"){{
            requirements(Category.crafting, with(Items.graphite, 5, Items.lead, 15));
            health = 90;
            consumes.power(0.50f);
        }};

        //TODO better name
        electrolyzer = new GenericCrafter("electrolyzer"){{
            requirements(Category.crafting, with(Items.silicon, 50, Items.graphite, 40, Items.beryllium, 40));
            size = 3;

            craftTime = 10f;
            rotate = true;

            liquidCapacity = 50f;

            consumes.liquid(Liquids.water, 5f / 60f);
            consumes.power(2f);

            drawer = new DrawMulti(
                new DrawRegion("-bottom"),
                new DrawLiquidTile(Liquids.water, 2f),
                new DrawBubbles(Color.valueOf("7693e3")){{
                    sides = 10;
                    recurrence = 3f;
                    spread = 6;
                    radius = 1.5f;
                    amount = 20;
                }},
                new DrawRegion(),
                new DrawLiquidOutputs(),
                new DrawGlowRegion(){{
                    alpha = 0.7f;
                    color = Color.valueOf("c4bdf3");
                    glowIntensity = 0.3f;
                    glowScale = 6f;
                }}
            );

            iconOverride = new String[]{"-bottom", ""};
            outputLiquids = LiquidStack.with(Liquids.ozone, 2f * craftTime / 60, Liquids.hydrogen, 3f * craftTime / 60);
            liquidOutputDirections = new int[]{1, 3};
        }};

        atmosphericConcentrator = new HeatCrafter("atmospheric-concentrator"){{
            requirements(Category.crafting, with(Items.oxide, 50, Items.beryllium, 30, Items.silicon, 40));
            size = 3;
            craftTime = 10f;
            hasLiquids = true;

            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(Liquids.nitrogen, 4.1f), new DrawBlock(), new DrawHeatInput(),
            new DrawParticles(){{
                color = Color.valueOf("d4f0ff");
                alpha = 0.6f;
                particleSize = 4f;
                particles = 10;
                particleRad = 12f;
                particleLife = 140f;
            }});

            liquidCapacity = 40f;
            consumes.power(2f);

            heatRequirement = 5f;

            outputLiquid = new LiquidStack(Liquids.nitrogen, 4f * craftTime / 60f);
        }};

        oxidationChamber = new HeatProducer("oxidation-chamber"){{
            requirements(Category.crafting, with(Items.tungsten, 60, Items.graphite, 40, Items.silicon, 50));
            size = 3;

            outputItem = new ItemStack(Items.oxide, 1);

            consumes.liquid(Liquids.ozone, 2f / 60f);
            consumes.item(Items.beryllium);
            consumes.power(1f);

            rotateDraw = false;

            //TODO vent?
            iconOverride = new String[]{"-bottom", "", "-top1"};
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidRegion(), new DrawBlock(), new DrawHeatOutput());

            craftTime = 60f * 4f;
            liquidCapacity = 30f;
            heatOutput = 5f;
        }};

        slagHeater = new HeatProducer("slag-heater"){{
            requirements(Category.crafting, with(Items.tungsten, 30, Items.graphite, 30));

            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(Liquids.slag, 9f), new DrawHeatOutput(true));
            iconOverride = new String[]{"-bottom", ""};
            size = 2;
            craftTime = 60f * 1f;
            heatOutput = 2f;
            consumes.liquid(Liquids.slag, 20f / 60f);
            consumes.power(0.5f / 60f);
        }};

        slagIncinerator = new ItemIncinerator("slag-incinerator"){{
            requirements(Category.crafting, with(Items.tungsten, 15));
            size = 1;
            consumes.liquid(Liquids.slag, 2f / 60f);
        }};

        heatReactor = new HeatProducer("heat-reactor"){{
            //TODO gas/liquid requirement?
            requirements(Category.crafting, with(Items.oxide, 70, Items.graphite, 20, Items.carbide, 10, Items.thorium, 80));
            size = 3;
            craftTime = 60f * 10f;

            craftEffect = new RadialEffect(Fx.heatReactorSmoke, 4, 90f, 7f);

            itemCapacity = 20;
            consumes.item(Items.thorium, 2);
            outputItem = new ItemStack(Items.fissileMatter, 1);
        }};

        carbideCrucible = new HeatCrafter("carbide-crucible"){{
            requirements(Category.crafting, with(Items.tungsten, 90, Items.thorium, 70, Items.oxide, 50));
            craftEffect = Fx.none;
            outputItem = new ItemStack(Items.carbide, 1);
            craftTime = 60f * 3f;
            size = 3;
            itemCapacity = 20;
            hasPower = hasItems = true;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawCrucible(), new DrawBlock(), new DrawHeatInput());
            iconOverride = new String[]{"-bottom", ""};
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            heatRequirement = 10f;

            consumes.items(with(Items.tungsten, 2, Items.graphite, 3));
            consumes.power(2f);
        }};

        slagCentrifuge = new GenericCrafter("slag-centrifuge"){{
            requirements(Category.crafting, with(Items.carbide, 70, Items.graphite, 60, Items.silicon, 40, Items.oxide, 40));

            consumes.power(2f / 60f);

            size = 3;
            consumes.item(Items.sand, 1);
            consumes.liquid(Liquids.slag, 40f / 60f);
            liquidCapacity = 80f;

            var drawers = Seq.with(new DrawRegion("-bottom"), new DrawLiquidRegion(Liquids.slag){{ alpha = 0.7f; }});

            for(int i = 0; i < 5; i++){
                int fi = i;
                drawers.add(new DrawGlowRegion(-1f){{
                    glowIntensity = 0.3f;
                    rotateSpeed = 3f / (1f + fi/1.4f);
                    alpha = 0.4f;
                    color = new Color(1f, 0.5f, 0.5f, 1f);
                }});
            }

            drawer = new DrawMulti(drawers.and(new DrawBlock()));
            iconOverride = new String[]{"-bottom", ""};

            craftTime = 60f * 2f;

            outputLiquid = new LiquidStack(Liquids.gallium, 2f);
            outputItem = new ItemStack(Items.scrap, 1);
        }};

        //TODO should have a useful turret ammo byproduct? scrap?
        surgeCrucible = new HeatCrafter("surge-crucible"){{
            requirements(Category.crafting, with(Items.silicon, 100, Items.graphite, 80, Items.carbide, 60, Items.thorium, 90));

            size = 3;

            itemCapacity = 20;
            heatRequirement = 5f;
            craftTime = 60f * 3f;
            liquidCapacity = 80f * 5;

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            outputItem = new ItemStack(Items.surgeAlloy, 1);

            craftEffect = new RadialEffect(Fx.surgeCruciSmoke, 4, 90f, 5f);

            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawCircles(){{
                color = Color.valueOf("ffc073").a(0.24f);
                strokeMax = 2.5f;
                radius = 10f;
                amount = 3;
            }}, new DrawLiquidRegion(Liquids.slag), new DrawBlock(), new DrawHeatInput(),
            new DrawHeatRegion(){{
                color = Color.valueOf("ff6060ff");
            }},
            new DrawHeatRegion("-vents"){{
                color.a = 1f;
            }});
            iconOverride = new String[]{"-bottom", ""};

            consumes.item(Items.silicon, 3);
            //TODO must consume from 2 pumps, 1, or 1.5?
            //TODO consume hydrogen/ozone?
            consumes.liquid(Liquids.slag, 2f * 80f / 60f);
            consumes.power(2f); //TODO necessary?
        }};

        cyanogenSynthesizer = new HeatCrafter("cyanogen-synthesizer"){{
            //TODO requirements
            requirements(Category.crafting, with(Items.carbide, 50, Items.silicon, 80, Items.beryllium, 80));

            heatRequirement = 5f;

            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawLiquidTile(Liquids.cyanogen),
            new DrawParticles(){{
                color = Color.valueOf("89e8b6");
                alpha = 0.5f;
                particleSize = 3f;
                particles = 10;
                particleRad = 9f;
                particleLife = 200f;
                reverse = true;
                particleSizeInterp = Interp.one;
            }}, new DrawBlock(), new DrawHeatInput(), new DrawHeatRegion("-heat-top"));

            iconOverride = new String[]{"-bottom", ""};

            size = 3;

            liquidCapacity = 40f;
            outputLiquid = new LiquidStack(Liquids.cyanogen, 3f);
            craftTime = 60f * 1f;

            consumes.liquids(LiquidStack.with(Liquids.hydrogen, 3f / 60f, Liquids.nitrogen, 2f / 60f));
            consumes.item(Items.graphite);
            consumes.power(2f);
        }};

        //TODO bad name, and there's no use for phase yet...
        phaseSynthesizer = new HeatCrafter("phase-synthesizer"){{
            requirements(Category.crafting, with(Items.surgeAlloy, 60, Items.carbide, 40, Items.silicon, 80, Items.thorium, 80));

            size = 3;

            itemCapacity = 40;
            heatRequirement = 8f;
            craftTime = 60f * 2f;
            liquidCapacity = 10f * 4;

            ambientSound = Sounds.techloop;
            ambientSoundVolume = 0.03f;

            outputItem = new ItemStack(Items.phaseFabric, 1);

            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawSpikes(){{
                color = Color.valueOf("ffd59e");
                stroke = 1.5f;
                layers = 2;
                amount = 12;
                rotateSpeed = 0.5f;
                layerSpeed = -0.9f;
            }}, new DrawMultiWeave(){{
                glowColor = new Color(1f, 0.4f, 0.4f, 0.8f);
            }}, new DrawBlock(), new DrawHeatInput(), new DrawHeatRegion("-vents"){{
                color = new Color(1f, 0.4f, 0.3f, 1f);
            }});
            iconOverride = new String[]{"-bottom", "-weave", ""};

            consumes.items(with(Items.thorium, 2, Items.sand, 6));
            consumes.liquid(Liquids.ozone, 2f / 60f);
            consumes.power(8f);
        }};

        //TODO needs to be completely redone from the ground up
        cellSynthesisChamber = new LiquidConverter("cell-synthesis-chamber"){{
            //TODO booster mechanics?
            requirements(Category.crafting, with(Items.thorium, 100, Items.phaseFabric, 120, Items.titanium, 150, Items.surgeAlloy, 70));
            outputLiquid = new LiquidStack(Liquids.neoplasm, 0.4f);
            craftTime = 200f;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;
            outputsLiquid = true;
            drawer = new DrawCells(){{
                color = Color.valueOf("9e172c");
                particleColorFrom = Color.valueOf("9e172c");
                particleColorTo = Color.valueOf("f98f4a");
                radius = 2.5f;
                lifetime = 1400f;
                recurrence = 2f;
                particles = 20;
                range = 3f;
            }};
            liquidCapacity = 30f;

            consumes.power(2f);
            consumes.items(with(Items.sporePod, 3, Items.phaseFabric, 1));
            consumes.liquid(Liquids.water, 0.8f);
        }};

        //endregion
        //region defense

        int wallHealthMultiplier = 4;

        copperWall = new Wall("copper-wall"){{
            requirements(Category.defense, with(Items.copper, 6));
            health = 80 * wallHealthMultiplier;
        }};

        copperWallLarge = new Wall("copper-wall-large"){{
            requirements(Category.defense, ItemStack.mult(copperWall.requirements, 4));
            health = 80 * 4 * wallHealthMultiplier;
            size = 2;
        }};

        titaniumWall = new Wall("titanium-wall"){{
            requirements(Category.defense, with(Items.titanium, 6));
            health = 110 * wallHealthMultiplier;
        }};

        titaniumWallLarge = new Wall("titanium-wall-large"){{
            requirements(Category.defense, ItemStack.mult(titaniumWall.requirements, 4));
            health = 110 * wallHealthMultiplier * 4;
            size = 2;
        }};

        plastaniumWall = new Wall("plastanium-wall"){{
            requirements(Category.defense, with(Items.plastanium, 5, Items.metaglass, 2));
            health = 125 * wallHealthMultiplier;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
        }};

        plastaniumWallLarge = new Wall("plastanium-wall-large"){{
            requirements(Category.defense, ItemStack.mult(plastaniumWall.requirements, 4));
            health = 125 * wallHealthMultiplier * 4;
            size = 2;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
        }};

        thoriumWall = new Wall("thorium-wall"){{
            requirements(Category.defense, with(Items.thorium, 6));
            health = 200 * wallHealthMultiplier;
        }};

        thoriumWallLarge = new Wall("thorium-wall-large"){{
            requirements(Category.defense, ItemStack.mult(thoriumWall.requirements, 4));
            health = 200 * wallHealthMultiplier * 4;
            size = 2;
        }};

        phaseWall = new Wall("phase-wall"){{
            requirements(Category.defense, with(Items.phaseFabric, 6));
            health = 150 * wallHealthMultiplier;
            chanceDeflect = 10f;
            flashHit = true;
        }};

        phaseWallLarge = new Wall("phase-wall-large"){{
            requirements(Category.defense, ItemStack.mult(phaseWall.requirements, 4));
            health = 150 * 4 * wallHealthMultiplier;
            size = 2;
            chanceDeflect = 10f;
            flashHit = true;
        }};

        surgeWall = new Wall("surge-wall"){{
            requirements(Category.defense, with(Items.surgeAlloy, 6));
            health = 230 * wallHealthMultiplier;
            lightningChance = 0.05f;
        }};

        surgeWallLarge = new Wall("surge-wall-large"){{
            requirements(Category.defense, ItemStack.mult(surgeWall.requirements, 4));
            health = 230 * 4 * wallHealthMultiplier;
            size = 2;
            lightningChance = 0.05f;
        }};

        door = new Door("door"){{
            requirements(Category.defense, with(Items.titanium, 6, Items.silicon, 4));
            health = 100 * wallHealthMultiplier;
        }};

        doorLarge = new Door("door-large"){{
            requirements(Category.defense, ItemStack.mult(door.requirements, 4));
            openfx = Fx.dooropenlarge;
            closefx = Fx.doorcloselarge;
            health = 100 * 4 * wallHealthMultiplier;
            size = 2;
        }};

        scrapWall = new Wall("scrap-wall"){{
            requirements(Category.defense, BuildVisibility.sandboxOnly, with(Items.scrap, 6));
            health = 60 * wallHealthMultiplier;
            variants = 5;
        }};

        scrapWallLarge = new Wall("scrap-wall-large"){{
            requirements(Category.defense, BuildVisibility.sandboxOnly, ItemStack.mult(scrapWall.requirements, 4));
            health = 60 * 4 * wallHealthMultiplier;
            size = 2;
            variants = 4;
        }};

        scrapWallHuge = new Wall("scrap-wall-huge"){{
            requirements(Category.defense, BuildVisibility.sandboxOnly, ItemStack.mult(scrapWall.requirements, 9));
            health = 60 * 9 * wallHealthMultiplier;
            size = 3;
            variants = 3;
        }};

        scrapWallGigantic = new Wall("scrap-wall-gigantic"){{
            requirements(Category.defense, BuildVisibility.sandboxOnly, ItemStack.mult(scrapWall.requirements, 16));
            health = 60 * 16 * wallHealthMultiplier;
            size = 4;
        }};

        thruster = new Thruster("thruster"){{
            requirements(Category.defense, BuildVisibility.sandboxOnly, with(Items.scrap, 96));
            health = 55 * 16 * wallHealthMultiplier;
            size = 4;
        }};

        mender = new MendProjector("mender"){{
            requirements(Category.effect, with(Items.lead, 30, Items.copper, 25));
            consumes.power(0.3f);
            size = 1;
            reload = 200f;
            range = 40f;
            healPercent = 4f;
            phaseBoost = 4f;
            phaseRangeBoost = 20f;
            health = 80;
            consumes.item(Items.silicon).boost();
        }};

        mendProjector = new MendProjector("mend-projector"){{
            requirements(Category.effect, with(Items.lead, 100, Items.titanium, 25, Items.silicon, 40, Items.copper, 50));
            consumes.power(1.5f);
            size = 2;
            reload = 250f;
            range = 85f;
            healPercent = 11f;
            phaseBoost = 15f;
            health = 80 * size * size;
            consumes.item(Items.phaseFabric).boost();
        }};

        overdriveProjector = new OverdriveProjector("overdrive-projector"){{
            requirements(Category.effect, with(Items.lead, 100, Items.titanium, 75, Items.silicon, 75, Items.plastanium, 30));
            consumes.power(3.50f);
            size = 2;
            consumes.item(Items.phaseFabric).boost();
        }};

        overdriveDome = new OverdriveProjector("overdrive-dome"){{
            requirements(Category.effect, with(Items.lead, 200, Items.titanium, 130, Items.silicon, 130, Items.plastanium, 80, Items.surgeAlloy, 120));
            consumes.power(10f);
            size = 3;
            range = 200f;
            speedBoost = 2.5f;
            useTime = 300f;
            hasBoost = false;
            consumes.items(with(Items.phaseFabric, 1, Items.silicon, 1));
        }};

        forceProjector = new ForceProjector("force-projector"){{
            requirements(Category.effect, with(Items.lead, 100, Items.titanium, 75, Items.silicon, 125));
            size = 3;
            phaseRadiusBoost = 80f;
            radius = 101.7f;
            shieldHealth = 750f;
            cooldownNormal = 1.5f;
            cooldownLiquid = 1.2f;
            cooldownBrokenBase = 0.35f;

            consumes.item(Items.phaseFabric).boost();
            consumes.power(4f);
        }};

        shockMine = new ShockMine("shock-mine"){{
            requirements(Category.effect, with(Items.lead, 25, Items.silicon, 12));
            hasShadow = false;
            health = 50;
            damage = 25;
            tileDamage = 7f;
            length = 10;
            tendrils = 4;
        }};

        buildTower = new BuildTurret("build-tower"){{
            requirements(Category.effect, with(Items.silicon, 60, Items.tungsten, 60, Items.oxide, 40));
            outlineColor = Pal.darkOutline;
            consumes.power(3f);
            range = 120f;
            size = 3;
            health = 80;
            buildSpeed = 1.5f;
        }};

        //endregion
        //region distribution

        conveyor = new Conveyor("conveyor"){{
            requirements(Category.distribution, with(Items.copper, 1), true);
            health = 45;
            speed = 0.03f;
            displayedSpeed = 4.2f;
            buildCostMultiplier = 2f;
        }};

        titaniumConveyor = new Conveyor("titanium-conveyor"){{
            requirements(Category.distribution, with(Items.copper, 1, Items.lead, 1, Items.titanium, 1));
            health = 65;
            speed = 0.08f;
            displayedSpeed = 11f;
        }};

        plastaniumConveyor = new StackConveyor("plastanium-conveyor"){{
            requirements(Category.distribution, with(Items.plastanium, 1, Items.silicon, 1, Items.graphite, 1));
            health = 75;
            speed = 4f / 60f;
            itemCapacity = 10;
        }};

        armoredConveyor = new ArmoredConveyor("armored-conveyor"){{
            requirements(Category.distribution, with(Items.plastanium, 1, Items.thorium, 1, Items.metaglass, 1));
            health = 180;
            speed = 0.08f;
            displayedSpeed = 11f;
        }};

        junction = new Junction("junction"){{
            requirements(Category.distribution, with(Items.copper, 2), true);
            speed = 26;
            capacity = 6;
            health = 30;
            buildCostMultiplier = 6f;
        }};

        itemBridge = new BufferedItemBridge("bridge-conveyor"){{
            requirements(Category.distribution, with(Items.lead, 6, Items.copper, 6));
            fadeIn = moveArrows = false;
            range = 4;
            speed = 74f;
            arrowSpacing = 6f;
            bufferCapacity = 14;
        }};

        phaseConveyor = new ItemBridge("phase-conveyor"){{
            requirements(Category.distribution, with(Items.phaseFabric, 5, Items.silicon, 7, Items.lead, 10, Items.graphite, 10));
            range = 12;
            arrowPeriod = 0.9f;
            arrowTimeScl = 2.75f;
            hasPower = true;
            pulse = true;
            consumes.power(0.30f);
        }};

        sorter = new Sorter("sorter"){{
            requirements(Category.distribution, with(Items.lead, 2, Items.copper, 2));
            buildCostMultiplier = 3f;
        }};

        invertedSorter = new Sorter("inverted-sorter"){{
            requirements(Category.distribution, with(Items.lead, 2, Items.copper, 2));
            buildCostMultiplier = 3f;
            invert = true;
        }};

        router = new Router("router"){{
            requirements(Category.distribution, with(Items.copper, 3));
            buildCostMultiplier = 4f;
        }};

        distributor = new Router("distributor"){{
            requirements(Category.distribution, with(Items.lead, 4, Items.copper, 4));
            buildCostMultiplier = 3f;
            size = 2;
        }};

        overflowGate = new OverflowGate("overflow-gate"){{
            requirements(Category.distribution, with(Items.lead, 2, Items.copper, 4));
            buildCostMultiplier = 3f;
        }};

        underflowGate = new OverflowGate("underflow-gate"){{
            requirements(Category.distribution, with(Items.lead, 2, Items.copper, 4));
            buildCostMultiplier = 3f;
            invert = true;
        }};

        massDriver = new MassDriver("mass-driver"){{
            requirements(Category.distribution, with(Items.titanium, 125, Items.silicon, 75, Items.lead, 125, Items.thorium, 50));
            size = 3;
            itemCapacity = 120;
            reloadTime = 200f;
            range = 440f;
            consumes.power(1.75f);
        }};

        //erekir transport blocks

        duct = new Duct("duct"){{
            requirements(Category.distribution, with(Items.graphite, 2));
            speed = 4f;
        }};

        ductRouter = new DuctRouter("duct-router"){{
            requirements(Category.distribution, with(Items.graphite, 10));
            speed = 4f;
        }};

        overflowDuct = new OverflowDuct("overflow-duct"){{
            requirements(Category.distribution, with(Items.graphite, 10));
            speed = 4f;
        }};

        ductBridge = new DuctBridge("duct-bridge"){{
            requirements(Category.distribution, with(Items.graphite, 15, Items.tungsten, 5));
            speed = 4f;
        }};

        ductUnloader = new DirectionalUnloader("duct-unloader"){{
            requirements(Category.distribution, with(Items.graphite, 20, Items.silicon, 20, Items.tungsten, 10));
            speed = 4f;
        }};

        surgeConveyor = new StackConveyor("surge-conveyor"){{
            requirements(Category.distribution, with(Items.surgeAlloy, 3, Items.oxide, 5));
            health = 90;
            //TODO different base speed/item capacity?
            speed = 5f / 60f;
            itemCapacity = 10;

            outputRouter = false;
            hasPower = true;
            consumesPower = true;
            conductivePower = true;
            baseEfficiency = 1f;
            consumes.power(1f / 60f);
        }};

        surgeRouter = new StackRouter("surge-router"){{
            requirements(Category.distribution, with(Items.oxide, 10, Items.surgeAlloy, 10));

            speed = 6f;

            hasPower = true;
            consumesPower = true;
            conductivePower = true;
            baseEfficiency = 1f;
            consumes.power(3f / 60f);
        }};

        unitCargoLoader = new UnitCargoLoader("unit-cargo-loader"){{
            requirements(Category.distribution, with(Items.silicon, 80, Items.phaseFabric, 60, Items.carbide, 50, Items.oxide, 40));

            size = 3;

            consumes.power(4f / 60f);

            itemCapacity = 200;
        }};

        unitCargoUnloadPoint = new UnitCargoUnloadPoint("unit-cargo-unload-point"){{
            requirements(Category.distribution, with(Items.silicon, 60, Items.thorium, 80));

            size = 2;

            itemCapacity = 100;
        }};

        //endregion
        //region liquid

        mechanicalPump = new Pump("mechanical-pump"){{
            requirements(Category.liquid, with(Items.copper, 15, Items.metaglass, 10));
            pumpAmount = 7f / 60f;
        }};

        rotaryPump = new Pump("rotary-pump"){{
            requirements(Category.liquid, with(Items.copper, 70, Items.metaglass, 50, Items.silicon, 20, Items.titanium, 35));
            pumpAmount = 0.2f;
            consumes.power(0.3f);
            liquidCapacity = 30f;
            hasPower = true;
            size = 2;
        }};

        impulsePump = new Pump("impulse-pump"){{
            requirements(Category.liquid, with(Items.copper, 80, Items.metaglass, 90, Items.silicon, 30, Items.titanium, 40, Items.thorium, 35));
            pumpAmount = 0.22f;
            consumes.power(1.3f);
            liquidCapacity = 40f;
            hasPower = true;
            size = 3;
        }};

        conduit = new Conduit("conduit"){{
            requirements(Category.liquid, with(Items.metaglass, 1));
            health = 45;
        }};

        pulseConduit = new Conduit("pulse-conduit"){{
            requirements(Category.liquid, with(Items.titanium, 2, Items.metaglass, 1));
            liquidCapacity = 16f;
            liquidPressure = 1.025f;
            health = 90;
        }};

        platedConduit = new ArmoredConduit("plated-conduit"){{
            requirements(Category.liquid, with(Items.thorium, 2, Items.metaglass, 1, Items.plastanium, 1));
            liquidCapacity = 16f;
            liquidPressure = 1.025f;
            health = 220;
        }};

        liquidRouter = new LiquidRouter("liquid-router"){{
            requirements(Category.liquid, with(Items.graphite, 4, Items.metaglass, 2));
            liquidCapacity = 20f;
            newDrawing = true;
        }};

        liquidContainer = new LiquidRouter("liquid-container"){{
            requirements(Category.liquid, with(Items.titanium, 10, Items.metaglass, 15));
            liquidCapacity = 700f;
            size = 2;
            newDrawing = true;
        }};

        liquidTank = new LiquidRouter("liquid-tank"){{
            requirements(Category.liquid, with(Items.titanium, 30, Items.metaglass, 40));
            size = 3;
            liquidCapacity = 1800f;
            health = 500;
            newDrawing = true;
        }};

        liquidJunction = new LiquidJunction("liquid-junction"){{
            requirements(Category.liquid, with(Items.graphite, 2, Items.metaglass, 2));
        }};

        bridgeConduit = new LiquidBridge("bridge-conduit"){{
            requirements(Category.liquid, with(Items.graphite, 4, Items.metaglass, 8));
            fadeIn = moveArrows = false;
            arrowSpacing = 6f;
            range = 4;
            hasPower = false;
        }};

        phaseConduit = new LiquidBridge("phase-conduit"){{
            requirements(Category.liquid, with(Items.phaseFabric, 5, Items.silicon, 7, Items.metaglass, 20, Items.titanium, 10));
            range = 12;
            arrowPeriod = 0.9f;
            arrowTimeScl = 2.75f;
            hasPower = true;
            canOverdrive = false;
            pulse = true;
            consumes.power(0.30f);
        }};

        //reinforced stuff

        //TODO different name
        reinforcedPump = new Pump("reinforced-pump"){{
            requirements(Category.liquid, with(Items.beryllium, 40, Items.tungsten, 30, Items.silicon, 20));
            //TODO CUSTOM DRAW ANIMATION - pistons - repurpose DrawBlock?
            consumes.liquid(Liquids.hydrogen, 1.5f / 60f);

            pumpAmount = 80f / 60f / 4f;
            liquidCapacity = 40f;
            size = 2;
        }};

        reinforcedConduit = new ArmoredConduit("reinforced-conduit"){{
            requirements(Category.liquid, with(Items.beryllium, 2));
            botColor = Pal.darkestMetal;
            leaks = true;
            liquidCapacity = 20f;
            liquidPressure = 1.03f;
            health = 250;
        }};

        //TODO is this necessary? junctions are not good design
        //TODO make it leak
        reinforcedLiquidJunction = new LiquidJunction("reinforced-liquid-junction"){{
            requirements(Category.liquid, with(Items.tungsten, 4, Items.beryllium, 8));
            buildCostMultiplier = 3f;
            health = 260;
            ((Conduit)reinforcedConduit).junctionReplacement = this;
        }};

        reinforcedBridgeConduit = new DirectionLiquidBridge("reinforced-bridge-conduit"){{
            requirements(Category.liquid, with(Items.tungsten, 6, Items.beryllium, 10));
            range = 4;
            hasPower = false;

            ((Conduit)reinforcedConduit).rotBridgeReplacement = this;
        }};

        reinforcedLiquidRouter = new LiquidRouter("reinforced-liquid-router"){{
            requirements(Category.liquid, with(Items.tungsten, 4, Items.beryllium, 4));
            liquidCapacity = 30f;
            newDrawing = true;
            liquidPadding = 3f/4f;
        }};

        //TODO is there a need for a container if unloaders can unload 3x3s?
        reinforcedLiquidContainer = new LiquidRouter("reinforced-liquid-container"){{
            requirements(Category.liquid, with(Items.tungsten, 10, Items.beryllium, 16));
            liquidCapacity = 1000f;
            size = 2;
            newDrawing = true;
            liquidPadding = 6f/4f;
        }};

        reinforcedLiquidTank = new LiquidRouter("reinforced-liquid-tank"){{
            requirements(Category.liquid, with(Items.tungsten, 40, Items.beryllium, 50));
            size = 3;
            liquidCapacity = 2700f;
            newDrawing = true;
            liquidPadding = 2f;
        }};

        //endregion
        //region power

        powerNode = new PowerNode("power-node"){{
            requirements(Category.power, with(Items.copper, 1, Items.lead, 3));
            maxNodes = 10;
            laserRange = 6;
        }};

        powerNodeLarge = new PowerNode("power-node-large"){{
            requirements(Category.power, with(Items.titanium, 5, Items.lead, 10, Items.silicon, 3));
            size = 2;
            maxNodes = 15;
            laserRange = 9.5f;
        }};

        surgeTower = new PowerNode("surge-tower"){{
            requirements(Category.power, with(Items.titanium, 7, Items.lead, 10, Items.silicon, 15, Items.surgeAlloy, 15));
            size = 2;
            maxNodes = 2;
            laserRange = 40f;
            schematicPriority = -15;
        }};

        diode = new PowerDiode("diode"){{
            requirements(Category.power, with(Items.silicon, 10, Items.plastanium, 5, Items.metaglass, 10));
        }};

        battery = new Battery("battery"){{
            requirements(Category.power, with(Items.copper, 5, Items.lead, 20));
            consumes.powerBuffered(4000f);
            baseExplosiveness = 1f;
        }};

        batteryLarge = new Battery("battery-large"){{
            requirements(Category.power, with(Items.titanium, 20, Items.lead, 50, Items.silicon, 30));
            size = 3;
            consumes.powerBuffered(50000f);
            baseExplosiveness = 5f;
        }};

        beamNode = new BeamNode("beam-node"){{
            requirements(Category.power, with(Items.graphite, 5, Items.beryllium, 3));
            consumesPower = outputsPower = true;
            consumes.powerBuffered(1000f);
            range = 10;
        }};

        //TODO requirements
        beamTower = new BeamNode("beam-tower"){{
            requirements(Category.power, with(Items.beryllium, 30, Items.oxide, 20, Items.silicon, 10));
            size = 3;
            consumesPower = outputsPower = true;
            consumes.powerBuffered(40000f);
            range = 23;
        }};

        combustionGenerator = new BurnerGenerator("combustion-generator"){{
            requirements(Category.power, with(Items.copper, 25, Items.lead, 15));
            powerProduction = 1f;
            itemDuration = 120f;

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.03f;
        }};

        thermalGenerator = new ThermalGenerator("thermal-generator"){{
            requirements(Category.power, with(Items.copper, 40, Items.graphite, 35, Items.lead, 50, Items.silicon, 35, Items.metaglass, 40));
            powerProduction = 1.8f;
            generateEffect = Fx.redgeneratespark;
            effectChance = 0.011f;
            size = 2;
            floating = true;
            ambientSound = Sounds.hum;
            ambientSoundVolume = 0.06f;
        }};

        steamGenerator = new BurnerGenerator("steam-generator"){{
            requirements(Category.power, with(Items.copper, 35, Items.graphite, 25, Items.lead, 40, Items.silicon, 30));
            powerProduction = 5.5f;
            itemDuration = 90f;
            consumes.liquid(Liquids.water, 0.1f);
            hasLiquids = true;
            size = 2;
            iconOverride = new String[]{"", "-turbine0", "-turbine1"};

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.06f;
        }};

        differentialGenerator = new SingleTypeGenerator("differential-generator"){{
            requirements(Category.power, with(Items.copper, 70, Items.titanium, 50, Items.lead, 100, Items.silicon, 65, Items.metaglass, 50));
            powerProduction = 18f;
            itemDuration = 220f;
            hasLiquids = true;
            hasItems = true;
            size = 3;
            ambientSound = Sounds.steam;
            ambientSoundVolume = 0.03f;

            consumes.item(Items.pyratite).optional(true, false);
            consumes.liquid(Liquids.cryofluid, 0.1f);
        }};

        rtgGenerator = new DecayGenerator("rtg-generator"){{
            requirements(Category.power, with(Items.lead, 100, Items.silicon, 75, Items.phaseFabric, 25, Items.plastanium, 75, Items.thorium, 50));
            size = 2;
            powerProduction = 4.5f;
            itemDuration = 60 * 14f;
        }};

        solarPanel = new SolarGenerator("solar-panel"){{
            requirements(Category.power, with(Items.lead, 10, Items.silicon, 15));
            powerProduction = 0.1f;
        }};

        largeSolarPanel = new SolarGenerator("solar-panel-large"){{
            requirements(Category.power, with(Items.lead, 80, Items.silicon, 110, Items.phaseFabric, 15));
            size = 3;
            powerProduction = 1.3f;
        }};

        thoriumReactor = new NuclearReactor("thorium-reactor"){{
            requirements(Category.power, with(Items.lead, 300, Items.silicon, 200, Items.graphite, 150, Items.thorium, 150, Items.metaglass, 50));
            ambientSound = Sounds.hum;
            ambientSoundVolume = 0.24f;
            size = 3;
            health = 700;
            itemDuration = 360f;
            powerProduction = 15f;
            consumes.item(Items.thorium);
            heating = 0.02f;
            consumes.liquid(Liquids.cryofluid, heating / coolantPower).update(false);
        }};

        impactReactor = new ImpactReactor("impact-reactor"){{
            requirements(Category.power, with(Items.lead, 500, Items.silicon, 300, Items.graphite, 400, Items.thorium, 100, Items.surgeAlloy, 250, Items.metaglass, 250));
            size = 4;
            health = 900;
            powerProduction = 130f;
            itemDuration = 140f;
            ambientSound = Sounds.pulse;
            ambientSoundVolume = 0.07f;

            consumes.power(25f);
            consumes.item(Items.blastCompound);
            consumes.liquid(Liquids.cryofluid, 0.25f);
        }};

        //erekir

        turbineCondenser = new ThermalGenerator("turbine-condenser"){{
            requirements(Category.power, with(Items.graphite, 40, Items.beryllium, 40));
            attribute = Attribute.vent;
            displayEfficiencyScale = 1f / 9f;
            minEfficiency = 9f - 0.0001f;
            powerProduction = 3f / 9f;
            displayEfficiency = false;
            generateEffect = Fx.turbinegenerate;
            effectChance = 0.04f;
            size = 3;
            ambientSound = Sounds.hum;
            ambientSoundVolume = 0.06f;
            spinSpeed = 0.6f;
            spinners = true;
            hasLiquids = true;
            liquidOutput = new LiquidStack(Liquids.water, 10f / 60f / 9f);
            liquidCapacity = 20f;
        }};

        //TODO rename
        chemicalCombustionChamber = new SingleTypeGenerator("chemical-combustion-chamber"){{
            requirements(Category.power, with(Items.graphite, 40, Items.tungsten, 40, Items.oxide, 40f, Items.silicon, 30));
            powerProduction = 6f;
            consumes.liquids(LiquidStack.with(Liquids.ozone, 1f / 60f, Liquids.arkycite, 20f / 60f));
            size = 3;
            useItems = false;
            drawer = new DrawMulti(new DrawRegion("-bottom"), new DrawPistons(){{
                sinMag = 3f;
                sinScl = 5f;
            }}, new DrawRegion("-mid"), new DrawLiquidTile(Liquids.arkycite, 37f / 4f), new DrawBlock(), new DrawGlowRegion(){{
                alpha = 1f;
                glowScale = 5f;
                color = Color.valueOf("c967b099");
            }});
            iconOverride = new String[]{"-bottom", ""};
            generateEffect = Fx.none;

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.06f;
        }};

        if(false)
        pyrolysisGenerator = new SingleTypeGenerator("pyrolysis-generator"){{
            //TODO requirements
            requirements(Category.power, with(Items.graphite, 50, Items.carbide, 50, Items.oxide, 60f, Items.silicon, 40));
            powerProduction = 12f;

            //TODO ratios, extra requirements
            consumes.liquids(LiquidStack.with(Liquids.slag, 20f / 60f, Liquids.arkycite, 20f / 60f));
            size = 3;
            useItems = false;

            //TODO water output? hydrogen??

            iconOverride = new String[]{"-bottom", ""};
            generateEffect = Fx.none;

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.06f;
        }};

        //TODO volatile reactor;
        //- input arkycite, ozone(?), some item(?), maybe slag or heat?
        //- output water, power

        //endregion power
        //region production

        mechanicalDrill = new Drill("mechanical-drill"){{
            requirements(Category.production, with(Items.copper, 12), true);
            tier = 2;
            drillTime = 600;
            size = 2;

            consumes.liquid(Liquids.water, 0.05f).boost();
        }};

        pneumaticDrill = new Drill("pneumatic-drill"){{
            requirements(Category.production, with(Items.copper, 18, Items.graphite, 10));
            tier = 3;
            drillTime = 400;
            size = 2;

            consumes.liquid(Liquids.water, 0.06f).boost();
        }};

        laserDrill = new Drill("laser-drill"){{
            requirements(Category.production, with(Items.copper, 35, Items.graphite, 30, Items.silicon, 30, Items.titanium, 20));
            drillTime = 280;
            size = 3;
            hasPower = true;
            tier = 4;
            updateEffect = Fx.pulverizeMedium;
            drillEffect = Fx.mineBig;
            envEnabled |= Env.space;

            consumes.power(1.10f);
            consumes.liquid(Liquids.water, 0.08f).boost();
        }};

        blastDrill = new Drill("blast-drill"){{
            requirements(Category.production, with(Items.copper, 65, Items.silicon, 60, Items.titanium, 50, Items.thorium, 75));
            drillTime = 280;
            size = 4;
            drawRim = true;
            hasPower = true;
            tier = 5;
            updateEffect = Fx.pulverizeRed;
            updateEffectChance = 0.03f;
            drillEffect = Fx.mineHuge;
            rotateSpeed = 6f;
            warmupSpeed = 0.01f;
            itemCapacity = 20;

            //more than the laser drill
            liquidBoostIntensity = 1.8f;

            consumes.power(3f);
            consumes.liquid(Liquids.water, 0.1f).boost();
        }};

        //TODO should be crusher or something
        impactDrill = new BurstDrill("impact-drill"){{
            requirements(Category.production, with(Items.silicon, 60, Items.beryllium, 90, Items.graphite, 50));
            drillTime = 60f * 12f;
            size = 4;
            hasPower = true;
            tier = 6;
            drillEffect = new MultiEffect(Fx.mineImpact, Fx.drillSteam);
            shake = 4f;
            itemCapacity = 40;

            consumes.power(3f);
            consumes.liquid(Liquids.water, 0.2f);
        }};

        //TODO higher tier impact drill, 5x5

        waterExtractor = new SolidPump("water-extractor"){{
            requirements(Category.production, with(Items.metaglass, 30, Items.graphite, 30, Items.lead, 30, Items.copper, 30));
            result = Liquids.water;
            pumpAmount = 0.11f;
            size = 2;
            liquidCapacity = 30f;
            rotateSpeed = 1.4f;
            attribute = Attribute.water;
            envRequired |= Env.groundWater;

            consumes.power(1.5f);
        }};

        cultivator = new AttributeCrafter("cultivator"){{
            requirements(Category.production, with(Items.copper, 25, Items.lead, 25, Items.silicon, 10));
            outputItem = new ItemStack(Items.sporePod, 1);
            craftTime = 100;
            size = 2;
            hasLiquids = true;
            hasPower = true;
            hasItems = true;

            craftEffect = Fx.none;
            envRequired |= Env.spores;
            attribute = Attribute.spores;

            legacyReadWarmup = true;
            drawer = new DrawCultivator();
            maxBoost = 2f;

            consumes.power(80f / 60f);
            consumes.liquid(Liquids.water, 18f / 60f);
        }};

        oilExtractor = new Fracker("oil-extractor"){{
            requirements(Category.production, with(Items.copper, 150, Items.graphite, 175, Items.lead, 115, Items.thorium, 115, Items.silicon, 75));
            result = Liquids.oil;
            updateEffect = Fx.pulverize;
            updateEffectChance = 0.05f;
            pumpAmount = 0.25f;
            size = 3;
            liquidCapacity = 30f;
            attribute = Attribute.oil;
            baseEfficiency = 0f;
            itemUseTime = 60f;

            consumes.item(Items.sand);
            consumes.power(3f);
            consumes.liquid(Liquids.water, 0.15f);
        }};

        cliffCrusher = new WallCrafter("cliff-crusher"){{
            requirements(Category.production, with(Items.graphite, 20, Items.beryllium, 20));

            consumes.power(0.9f);

            drillTime = 110f;
            size = 2;
            attribute = Attribute.silicate;
            output = Items.sand;
        }};

        plasmaBore = new BeamDrill("plasma-bore"){{
            requirements(Category.production, with(Items.graphite, 20, Items.beryllium, 30));
            consumes.power(0.2f);
            drillTime = 200f;
            tier = 4;
            size = 2;
            range = 3; //TODO make it 2?

            consumes.liquid(Liquids.hydrogen, 1f / 60f).boost();
        }};

        //TODO awful name
        largePlasmaBore = new BeamDrill("large-plasma-bore"){{
            //TODO requirements
            requirements(Category.production, with(Items.graphite, 30, Items.oxide, 30, Items.beryllium, 20, Items.carbide, 30));
            consumes.power(0.6f);
            drillTime = 170f;
            tier = 5;
            size = 3;
            range = 6;
            laserWidth = 0.7f;

            consumes.liquid(Liquids.hydrogen, 2f / 60f).boost();
        }};

        //endregion
        //region storage

        coreShard = new CoreBlock("core-shard"){{
            requirements(Category.effect, BuildVisibility.editorOnly, with(Items.copper, 1000, Items.lead, 800));
            alwaysUnlocked = true;

            unitType = UnitTypes.alpha;
            health = 1100;
            itemCapacity = 4000;
            size = 3;

            unitCapModifier = 8;
        }};

        coreFoundation = new CoreBlock("core-foundation"){{
            requirements(Category.effect, with(Items.copper, 3000, Items.lead, 3000, Items.silicon, 2000));

            unitType = UnitTypes.beta;
            health = 3500;
            itemCapacity = 9000;
            size = 4;
            thrusterLength = 34/4f;

            unitCapModifier = 16;
            researchCostMultiplier = 0.07f;
        }};

        coreNucleus = new CoreBlock("core-nucleus"){{
            requirements(Category.effect, with(Items.copper, 8000, Items.lead, 8000, Items.silicon, 5000, Items.thorium, 4000));

            unitType = UnitTypes.gamma;
            health = 6000;
            itemCapacity = 13000;
            size = 5;
            thrusterLength = 40/4f;

            unitCapModifier = 24;
            researchCostMultiplier = 0.11f;
        }};

        coreBastion = new CoreBlock("core-bastion"){{
            //TODO cost
            requirements(Category.effect, BuildVisibility.editorOnly, with(Items.graphite, 1000, Items.beryllium, 800));

            unitType = UnitTypes.evoke;
            health = 7000;
            itemCapacity = 8000;
            size = 4;
            thrusterLength = 34/4f;

            unitCapModifier = 20;
            researchCostMultiplier = 0.07f;
        }};

        coreCitadel = new CoreBlock("core-citadel"){{
            //TODO cost
            requirements(Category.effect, with(Items.beryllium, 7000, Items.graphite, 7000, Items.tungsten, 5000, Items.carbide, 5000));

            unitType = UnitTypes.incite;
            health = 14000;
            itemCapacity = 11000;
            size = 5;
            thrusterLength = 40/4f;

            unitCapModifier = 30;
            researchCostMultiplier = 0.11f;
        }};

        coreAcropolis = new CoreBlock("core-acropolis"){{
            //TODO cost
            requirements(Category.effect, with(Items.beryllium, 11000, Items.graphite, 11000, Items.tungsten, 9000, Items.carbide, 10000));

            unitType = UnitTypes.emanate;
            health = 22000;
            itemCapacity = 16000;
            size = 6;
            thrusterLength = 48/4f;

            unitCapModifier = 40;
            researchCostMultiplier = 0.11f;
        }};

        container = new StorageBlock("container"){{
            requirements(Category.effect, with(Items.titanium, 100));
            size = 2;
            itemCapacity = 300;
            health = size * size * 55;
        }};

        vault = new StorageBlock("vault"){{
            requirements(Category.effect, with(Items.titanium, 250, Items.thorium, 125));
            size = 3;
            itemCapacity = 1000;
            health = size * size * 55;
        }};

        //TODO move tabs?
        unloader = new Unloader("unloader"){{
            requirements(Category.effect, with(Items.titanium, 25, Items.silicon, 30));
            speed = 60f / 11f;
            group = BlockGroup.transportation;
        }};

        reinforcedContainer = new StorageBlock("reinforced-container"){{
            requirements(Category.effect, with(Items.tungsten, 100, Items.graphite, 50));
            size = 3;
            //TODO should it really be kept the same, at 1000?
            itemCapacity = 1000;
            health = size * size * 120;
        }};

        reinforcedVault = new StorageBlock("reinforced-vault"){{
            requirements(Category.effect, with(Items.tungsten, 250, Items.carbide, 125));
            size = 4;
            itemCapacity = 2500;
            health = size * size * 120;
        }};

        //endregion
        //region turrets

        duo = new ItemTurret("duo"){{
            requirements(Category.turret, with(Items.copper, 35), true);
            ammo(
                Items.copper, Bullets.standardCopper,
                Items.graphite, Bullets.standardDense,
                Items.pyratite, Bullets.standardIncendiary,
                Items.silicon, Bullets.standardHoming
            );

            spread = 4f;
            shots = 2;
            alternate = true;
            reloadTime = 20f;
            restitution = 0.03f;
            range = 110;
            shootCone = 15f;
            ammoUseEffect = Fx.casing1;
            health = 250;
            inaccuracy = 2f;
            rotateSpeed = 10f;

            limitRange();
        }};

        scatter = new ItemTurret("scatter"){{
            requirements(Category.turret, with(Items.copper, 85, Items.lead, 45));
            ammo(
                Items.scrap, Bullets.flakScrap,
                Items.lead, Bullets.flakLead,
                Items.metaglass, Bullets.flakGlass
            );
            reloadTime = 18f;
            range = 220f;
            size = 2;
            burstSpacing = 5f;
            shots = 2;
            targetGround = false;

            recoilAmount = 2f;
            rotateSpeed = 15f;
            inaccuracy = 17f;
            shootCone = 35f;

            health = 200 * size * size;
            shootSound = Sounds.shootSnap;

            limitRange(2);
        }};

        scorch = new ItemTurret("scorch"){{
            requirements(Category.turret, with(Items.copper, 25, Items.graphite, 22));
            ammo(
                Items.coal, Bullets.basicFlame,
                Items.pyratite, Bullets.pyraFlame
            );
            recoilAmount = 0f;
            reloadTime = 6f;
            coolantMultiplier = 1.5f;
            range = 60f;
            shootCone = 50f;
            targetAir = false;
            ammoUseEffect = Fx.none;
            health = 400;
            shootSound = Sounds.flame;
        }};

        hail = new ItemTurret("hail"){{
            requirements(Category.turret, with(Items.copper, 40, Items.graphite, 17));
            ammo(
                Items.graphite, Bullets.artilleryDense,
                Items.silicon, Bullets.artilleryHoming,
                Items.pyratite, Bullets.artilleryIncendiary
            );
            targetAir = false;
            reloadTime = 60f;
            recoilAmount = 2f;
            range = 235f;
            inaccuracy = 1f;
            shootCone = 10f;
            health = 260;
            shootSound = Sounds.bang;
            limitRange(0f);
        }};

        wave = new LiquidTurret("wave"){{
            requirements(Category.turret, with(Items.metaglass, 45, Items.lead, 75, Items.copper, 25));
            ammo(
                Liquids.water, Bullets.waterShot,
                Liquids.slag, Bullets.slagShot,
                Liquids.cryofluid, Bullets.cryoShot,
                Liquids.oil, Bullets.oilShot
            );
            size = 2;
            recoilAmount = 0f;
            reloadTime = 3f;
            inaccuracy = 5f;
            shootCone = 50f;
            liquidCapacity = 10f;
            shootEffect = Fx.shootLiquid;
            range = 110f;
            health = 250 * size * size;
            flags = EnumSet.of(BlockFlag.turret, BlockFlag.extinguisher);
        }};

        lancer = new PowerTurret("lancer"){{
            requirements(Category.turret, with(Items.copper, 60, Items.lead, 70, Items.silicon, 50));
            range = 165f;
            chargeTime = 40f;
            chargeMaxDelay = 30f;
            chargeEffects = 7;
            recoilAmount = 2f;
            reloadTime = 80f;
            cooldown = 0.03f;
            powerUse = 6f;
            shootShake = 2f;
            shootEffect = Fx.lancerLaserShoot;
            smokeEffect = Fx.none;
            chargeEffect = Fx.lancerLaserCharge;
            chargeBeginEffect = Fx.lancerLaserChargeBegin;
            heatColor = Color.red;
            size = 2;
            health = 280 * size * size;
            targetAir = false;
            shootSound = Sounds.laser;

            shootType = new LaserBulletType(140){{
                colors = new Color[]{Pal.lancerLaser.cpy().a(0.4f), Pal.lancerLaser, Color.white};
                hitEffect = Fx.hitLancer;
                hitSize = 4;
                lifetime = 16f;
                drawSize = 400f;
                collidesAir = false;
                length = 173f;
                ammoMultiplier = 1f;
            }};
        }};

        arc = new PowerTurret("arc"){{
            requirements(Category.turret, with(Items.copper, 50, Items.lead, 50));
            shootType = new LightningBulletType(){{
                damage = 20;
                lightningLength = 25;
                collidesAir = false;
                ammoMultiplier = 1f;
            }};
            reloadTime = 35f;
            shootCone = 40f;
            rotateSpeed = 8f;
            powerUse = 3.3f;
            targetAir = false;
            range = 90f;
            shootEffect = Fx.lightningShoot;
            heatColor = Color.red;
            recoilAmount = 1f;
            size = 1;
            health = 260;
            shootSound = Sounds.spark;
        }};

        parallax = new TractorBeamTurret("parallax"){{
            requirements(Category.turret, with(Items.silicon, 120, Items.titanium, 90, Items.graphite, 30));

            hasPower = true;
            size = 2;
            force = 12f;
            scaledForce = 6f;
            range = 240f;
            damage = 0.3f;
            health = 160 * size * size;
            rotateSpeed = 10;

            consumes.powerCond(3f, (TractorBeamBuild e) -> e.target != null);
        }};

        swarmer = new ItemTurret("swarmer"){{
            requirements(Category.turret, with(Items.graphite, 35, Items.titanium, 35, Items.plastanium, 45, Items.silicon, 30));
            ammo(
                Items.blastCompound, Bullets.missileExplosive,
                Items.pyratite, Bullets.missileIncendiary,
                Items.surgeAlloy, Bullets.missileSurge
            );
            reloadTime = 30f;
            shots = 4;
            burstSpacing = 5;
            inaccuracy = 10f;
            range = 240f;
            xRand = 6f;
            size = 2;
            health = 300 * size * size;
            shootSound = Sounds.missile;

            limitRange(5f);
        }};

        salvo = new ItemTurret("salvo"){{
            requirements(Category.turret, with(Items.copper, 100, Items.graphite, 80, Items.titanium, 50));
            ammo(
                Items.copper, Bullets.standardCopper,
                Items.graphite, Bullets.standardDense,
                Items.pyratite, Bullets.standardIncendiary,
                Items.silicon, Bullets.standardHoming,
                Items.thorium, Bullets.standardThorium
            );

            size = 2;
            range = 190f;
            reloadTime = 31f;
            restitution = 0.03f;
            ammoEjectBack = 3f;
            cooldown = 0.03f;
            recoilAmount = 3f;
            shootShake = 1f;
            burstSpacing = 3f;
            spread = 0f;
            shots = 4;
            ammoUseEffect = Fx.casing2;
            health = 240 * size * size;
            shootSound = Sounds.shootBig;

            limitRange();
        }};

        segment = new PointDefenseTurret("segment"){{
            requirements(Category.turret, with(Items.silicon, 130, Items.thorium, 80, Items.phaseFabric, 40, Items.titanium, 40));

            health = 250 * size * size;
            range = 180f;
            hasPower = true;
            consumes.powerCond(8f, (PointDefenseBuild b) -> b.target != null);
            size = 2;
            shootLength = 5f;
            bulletDamage = 30f;
            reloadTime = 8f;
        }};

        tsunami = new LiquidTurret("tsunami"){{
            requirements(Category.turret, with(Items.metaglass, 100, Items.lead, 400, Items.titanium, 250, Items.thorium, 100));
            ammo(
                Liquids.water, Bullets.heavyWaterShot,
                Liquids.slag, Bullets.heavySlagShot,
                Liquids.cryofluid, Bullets.heavyCryoShot,
                Liquids.oil, Bullets.heavyOilShot
            );
            size = 3;
            reloadTime = 3f;
            shots = 2;
            velocityInaccuracy = 0.1f;
            inaccuracy = 4f;
            recoilAmount = 1f;
            restitution = 0.04f;
            shootCone = 45f;
            liquidCapacity = 40f;
            shootEffect = Fx.shootLiquid;
            range = 190f;
            health = 250 * size * size;
            flags = EnumSet.of(BlockFlag.turret, BlockFlag.extinguisher);
        }};

        fuse = new ItemTurret("fuse"){{
            requirements(Category.turret, with(Items.copper, 225, Items.graphite, 225, Items.thorium, 100));

            reloadTime = 35f;
            shootShake = 4f;
            range = 90f;
            recoilAmount = 5f;
            shots = 3;
            spread = 20f;
            restitution = 0.1f;
            shootCone = 30;
            size = 3;

            health = 220 * size * size;
            shootSound = Sounds.shotgun;

            float brange = range + 10f;

            ammo(
                Items.titanium, new ShrapnelBulletType(){{
                    length = brange;
                    damage = 66f;
                    ammoMultiplier = 4f;
                    width = 17f;
                    reloadMultiplier = 1.3f;
                }},
                Items.thorium, new ShrapnelBulletType(){{
                    length = brange;
                    damage = 105f;
                    ammoMultiplier = 5f;
                    toColor = Pal.thoriumPink;
                    shootEffect = smokeEffect = Fx.thoriumShoot;
                }}
            );
        }};

        ripple = new ItemTurret("ripple"){{
            requirements(Category.turret, with(Items.copper, 150, Items.graphite, 135, Items.titanium, 60));
            ammo(
                Items.graphite, Bullets.artilleryDense,
                Items.silicon, Bullets.artilleryHoming,
                Items.pyratite, Bullets.artilleryIncendiary,
                Items.blastCompound, Bullets.artilleryExplosive,
                Items.plastanium, Bullets.artilleryPlastic
            );

            targetAir = false;
            size = 3;
            shots = 4;
            inaccuracy = 12f;
            reloadTime = 60f;
            ammoEjectBack = 5f;
            ammoUseEffect = Fx.casing3Double;
            ammoPerShot = 2;
            cooldown = 0.03f;
            velocityInaccuracy = 0.2f;
            restitution = 0.02f;
            recoilAmount = 6f;
            shootShake = 2f;
            range = 290f;
            minRange = 50f;

            health = 130 * size * size;
            shootSound = Sounds.artillery;
        }};

        cyclone = new ItemTurret("cyclone"){{
            requirements(Category.turret, with(Items.copper, 200, Items.titanium, 125, Items.plastanium, 80));
            ammo(
                Items.metaglass, Bullets.fragGlass,
                Items.blastCompound, Bullets.fragExplosive,
                Items.plastanium, Bullets.fragPlastic,
                Items.surgeAlloy, Bullets.fragSurge
            );
            xRand = 4f;
            reloadTime = 8f;
            range = 200f;
            size = 3;
            recoilAmount = 3f;
            rotateSpeed = 10f;
            inaccuracy = 10f;
            shootCone = 30f;
            shootSound = Sounds.shootSnap;

            health = 145 * size * size;
            limitRange();
        }};

        foreshadow = new ItemTurret("foreshadow"){{
            float brange = range = 500f;

            requirements(Category.turret, with(Items.copper, 1000, Items.metaglass, 600, Items.surgeAlloy, 300, Items.plastanium, 200, Items.silicon, 600));
            ammo(
                Items.surgeAlloy, new PointBulletType(){{
                    shootEffect = Fx.instShoot;
                    hitEffect = Fx.instHit;
                    smokeEffect = Fx.smokeCloud;
                    trailEffect = Fx.instTrail;
                    despawnEffect = Fx.instBomb;
                    trailSpacing = 20f;
                    damage = 1350;
                    buildingDamageMultiplier = 0.2f;
                    speed = brange;
                    hitShake = 6f;
                    ammoMultiplier = 1f;
                }}
            );

            maxAmmo = 40;
            ammoPerShot = 5;
            rotateSpeed = 2f;
            reloadTime = 200f;
            ammoUseEffect = Fx.casing3Double;
            recoilAmount = 5f;
            restitution = 0.009f;
            cooldown = 0.009f;
            shootShake = 4f;
            shots = 1;
            size = 4;
            shootCone = 2f;
            shootSound = Sounds.railgun;
            unitSort = UnitSorts.strongest;

            coolantMultiplier = 0.4f;

            health = 150 * size * size;
            coolantUsage = 1f;

            consumes.powerCond(10f, TurretBuild::isActive);
        }};

        spectre = new ItemTurret("spectre"){{
            requirements(Category.turret, with(Items.copper, 900, Items.graphite, 300, Items.surgeAlloy, 250, Items.plastanium, 175, Items.thorium, 250));
            ammo(
                Items.graphite, Bullets.standardDenseBig,
                Items.pyratite, Bullets.standardIncendiaryBig,
                Items.thorium, Bullets.standardThoriumBig
            );
            reloadTime = 7f;
            coolantMultiplier = 0.5f;
            restitution = 0.1f;
            ammoUseEffect = Fx.casing3;
            range = 260f;
            inaccuracy = 3f;
            recoilAmount = 3f;
            spread = 8f;
            alternate = true;
            shootShake = 2f;
            shots = 2;
            size = 4;
            shootCone = 24f;
            shootSound = Sounds.shootBig;

            health = 160 * size * size;
            coolantUsage = 1f;

            limitRange();
        }};

        meltdown = new LaserTurret("meltdown"){{
            requirements(Category.turret, with(Items.copper, 1200, Items.lead, 350, Items.graphite, 300, Items.surgeAlloy, 325, Items.silicon, 325));
            shootEffect = Fx.shootBigSmoke2;
            shootCone = 40f;
            recoilAmount = 4f;
            size = 4;
            shootShake = 2f;
            range = 195f;
            reloadTime = 90f;
            firingMoveFract = 0.5f;
            shootDuration = 230f;
            powerUse = 17f;
            shootSound = Sounds.laserbig;
            loopSound = Sounds.beam;
            loopSoundVolume = 2f;

            shootType = new ContinuousLaserBulletType(78){{
                length = 200f;
                hitEffect = Fx.hitMeltdown;
                hitColor = Pal.meltdownHit;
                status = StatusEffects.melting;
                drawSize = 420f;

                incendChance = 0.4f;
                incendSpread = 5f;
                incendAmount = 1;
                ammoMultiplier = 1f;
            }};

            health = 200 * size * size;
            consumes.add(new ConsumeCoolant(0.5f)).update(false);
        }};

        //TODO tungsten?
        breach = new ItemTurret("breach"){{
            requirements(Category.turret, with(Items.beryllium, 35, Items.silicon, 20), true);
            ammo(
            Items.beryllium, new BasicBulletType(7f, 30){{
                width = 8f;
                height = 14f;
                shootEffect = Fx.berylSpark;
                smokeEffect = Fx.shootBigSmoke;
                ammoMultiplier = 1;
                pierce = true;
                pierceBuilding = true;
                hitColor = backColor = trailColor = Pal.berylShot;
                frontColor = Color.white;
                trailWidth = 1.5f;
                trailLength = 10;
                //TODO different effect?
                hitEffect = despawnEffect = Fx.hitBulletColor;
            }}
            );

            //TODO no coolant?

            acceptCoolant = false;
            draw = new DrawTurret("reinforced-");
            shootLength = 0f;
            outlineColor = Pal.darkOutline;
            size = 2;
            envEnabled |= Env.space;
            reloadTime = 40f;
            restitution = 0.03f;
            range = 180;
            shootCone = 3f;
            health = 300 * size * size;
            rotateSpeed = 1.8f;

            limitRange();
        }};

        //TODO implementation; splash damage? shotgun? AA? I have no ideas
        fracture = new ItemTurret("fracture"){{
            requirements(Category.turret, with(Items.tungsten, 35, Items.silicon, 35), true);
            ammo(
            Items.tungsten, new BasicBulletType(5f, 20){{
                velocityInaccuracy = 0.2f;
                width = 6f;
                height = 12f;
                shootEffect = Fx.berylSpark;
                smokeEffect = Fx.shootBigSmoke;
                ammoMultiplier = 2;
                pierce = true;
                pierceBuilding = true;
                hitColor = backColor = trailColor = Items.tungsten.color;
                frontColor = Color.white;
                trailWidth = 1f;
                trailLength = 4;
                //TODO different effect?
                hitEffect = despawnEffect = Fx.hitBulletColor;
            }}
            );

            acceptCoolant = false;
            consumes.liquid(Liquids.hydrogen, 1.5f / 60f);
            shots = 5;

            //TODO cool reload animation
            draw = new DrawTurret("reinforced-");
            shootLength = 8f;
            outlineColor = Pal.darkOutline;
            size = 2;
            envEnabled |= Env.space;
            reloadTime = 30f;
            restitution = 0.03f;
            range = 90;
            shootCone = 15f;
            inaccuracy = 20f;
            health = 300 * size * size;
            rotateSpeed = 1.8f;

            limitRange();
        }};

        //TODO bad name
        sublimate = new ContinuousTurret("sublimate"){{
            //TODO requirements
            requirements(Category.turret, with(Items.tungsten, 35, Items.silicon, 35), true);

            draw = new DrawTurret("reinforced-"){{
                liquidDraw = Liquids.ozone;

                Color heatc = Color.valueOf("fa2859");
                heatColor = heatc;

                parts.addAll(new RegionPart("-back"){{
                    rotMove = 40f;
                    x = 22 / 4f;
                    y = -1f / 4f;
                    moveY = 6f / 4f;
                    under = true;
                    heatColor = heatc;
                }},
                new RegionPart("-front"){{
                    rotMove = 40f;
                    x = 20 / 4f;
                    y = 17f / 4f;
                    moveX = 1f;
                    moveY = 1f;
                    under = true;
                    heatColor = heatc;
                }},
                new RegionPart("-nozzle"){{
                    moveX = 8f / 4f;
                    heatColor = Color.valueOf("f03b0e");
                }});
            }};
            outlineColor = Pal.darkOutline;

            consumes.liquids(LiquidStack.with(Liquids.cyanogen, 3f / 60f, Liquids.ozone, 2f / 60f));

            range = 170f;

            //TODO unfinished, needs damage + proper mechanics
            shootType = new ContinuousFlameBulletType(){{
                damage = 4f;
                length = range;
                //pierceMax = 3;
            }};
            shootLength = 7f;
            size = 3;
        }};

        //endregion
        //region units

        commandCenter = new CommandCenter("command-center"){{
            requirements(Category.units, ItemStack.with(Items.copper, 200, Items.lead, 250, Items.silicon, 250, Items.graphite, 100));
            size = 2;
            health = size * size * 55;
        }};

        groundFactory = new UnitFactory("ground-factory"){{
            requirements(Category.units, with(Items.copper, 50, Items.lead, 120, Items.silicon, 80));
            plans = Seq.with(
                new UnitPlan(UnitTypes.dagger, 60f * 15, with(Items.silicon, 10, Items.lead, 10)),
                new UnitPlan(UnitTypes.crawler, 60f * 10, with(Items.silicon, 8, Items.coal, 10)),
                new UnitPlan(UnitTypes.nova, 60f * 40, with(Items.silicon, 30, Items.lead, 20, Items.titanium, 20))
            );
            size = 3;
            consumes.power(1.2f);
        }};

        airFactory = new UnitFactory("air-factory"){{
            requirements(Category.units, with(Items.copper, 60, Items.lead, 70));
            plans = Seq.with(
                new UnitPlan(UnitTypes.flare, 60f * 15, with(Items.silicon, 15)),
                new UnitPlan(UnitTypes.mono, 60f * 35, with(Items.silicon, 30, Items.lead, 15))
            );
            size = 3;
            consumes.power(1.2f);
        }};

        navalFactory = new UnitFactory("naval-factory"){{
            requirements(Category.units, with(Items.copper, 150, Items.lead, 130, Items.metaglass, 120));
            plans = Seq.with(
                new UnitPlan(UnitTypes.risso, 60f * 45f, with(Items.silicon, 20, Items.metaglass, 35)),
                new UnitPlan(UnitTypes.retusa, 60f * 50f, with(Items.silicon, 15, Items.metaglass, 25, Items.titanium, 20))
            );
            size = 3;
            consumes.power(1.2f);
            floating = true;
        }};

        additiveReconstructor = new Reconstructor("additive-reconstructor"){{
            requirements(Category.units, with(Items.copper, 200, Items.lead, 120, Items.silicon, 90));

            size = 3;
            consumes.power(3f);
            consumes.items(with(Items.silicon, 40, Items.graphite, 40));

            constructTime = 60f * 10f;

            upgrades.addAll(
                new UnitType[]{UnitTypes.nova, UnitTypes.pulsar},
                new UnitType[]{UnitTypes.dagger, UnitTypes.mace},
                new UnitType[]{UnitTypes.crawler, UnitTypes.atrax},
                new UnitType[]{UnitTypes.flare, UnitTypes.horizon},
                new UnitType[]{UnitTypes.mono, UnitTypes.poly},
                new UnitType[]{UnitTypes.risso, UnitTypes.minke},
                new UnitType[]{UnitTypes.retusa, UnitTypes.oxynoe}
            );
        }};

        multiplicativeReconstructor = new Reconstructor("multiplicative-reconstructor"){{
            requirements(Category.units, with(Items.lead, 650, Items.silicon, 450, Items.titanium, 350, Items.thorium, 650));

            size = 5;
            consumes.power(6f);
            consumes.items(with(Items.silicon, 130, Items.titanium, 80, Items.metaglass, 40));

            constructTime = 60f * 30f;

            upgrades.addAll(
                new UnitType[]{UnitTypes.horizon, UnitTypes.zenith},
                new UnitType[]{UnitTypes.mace, UnitTypes.fortress},
                new UnitType[]{UnitTypes.poly, UnitTypes.mega},
                new UnitType[]{UnitTypes.minke, UnitTypes.bryde},
                new UnitType[]{UnitTypes.pulsar, UnitTypes.quasar},
                new UnitType[]{UnitTypes.atrax, UnitTypes.spiroct},
                new UnitType[]{UnitTypes.oxynoe, UnitTypes.cyerce}
            );
        }};

        exponentialReconstructor = new Reconstructor("exponential-reconstructor"){{
            requirements(Category.units, with(Items.lead, 2000, Items.silicon, 1000, Items.titanium, 2000, Items.thorium, 750, Items.plastanium, 450, Items.phaseFabric, 600));

            size = 7;
            consumes.power(13f);
            consumes.items(with(Items.silicon, 850, Items.titanium, 750, Items.plastanium, 650));
            consumes.liquid(Liquids.cryofluid, 1f);

            constructTime = 60f * 60f * 1.5f;
            liquidCapacity = 60f;

            upgrades.addAll(
                new UnitType[]{UnitTypes.zenith, UnitTypes.antumbra},
                new UnitType[]{UnitTypes.spiroct, UnitTypes.arkyid},
                new UnitType[]{UnitTypes.fortress, UnitTypes.scepter},
                new UnitType[]{UnitTypes.bryde, UnitTypes.sei},
                new UnitType[]{UnitTypes.mega, UnitTypes.quad},
                new UnitType[]{UnitTypes.quasar, UnitTypes.vela},
                new UnitType[]{UnitTypes.cyerce, UnitTypes.aegires}
            );
        }};

        tetrativeReconstructor = new Reconstructor("tetrative-reconstructor"){{
            requirements(Category.units, with(Items.lead, 4000, Items.silicon, 3000, Items.thorium, 1000, Items.plastanium, 600, Items.phaseFabric, 600, Items.surgeAlloy, 800));

            size = 9;
            consumes.power(25f);
            consumes.items(with(Items.silicon, 1000, Items.plastanium, 600, Items.surgeAlloy, 500, Items.phaseFabric, 350));
            consumes.liquid(Liquids.cryofluid, 3f);

            constructTime = 60f * 60f * 4;
            liquidCapacity = 180f;

            upgrades.addAll(
                new UnitType[]{UnitTypes.antumbra, UnitTypes.eclipse},
                new UnitType[]{UnitTypes.arkyid, UnitTypes.toxopid},
                new UnitType[]{UnitTypes.scepter, UnitTypes.reign},
                new UnitType[]{UnitTypes.sei, UnitTypes.omura},
                new UnitType[]{UnitTypes.quad, UnitTypes.oct},
                new UnitType[]{UnitTypes.vela, UnitTypes.corvus},
                new UnitType[]{UnitTypes.aegires, UnitTypes.navanax}
            );
        }};

        repairPoint = new RepairPoint("repair-point"){{
            requirements(Category.units, with(Items.lead, 30, Items.copper, 30, Items.silicon, 20));
            repairSpeed = 0.45f;
            repairRadius = 60f;
            beamWidth = 0.73f;
            powerUse = 1f;
            pulseRadius = 5f;
        }};

        repairTurret = new RepairPoint("repair-turret"){{
            requirements(Category.units, with(Items.silicon, 90, Items.thorium, 80, Items.plastanium, 60));
            size = 2;
            length = 6f;
            repairSpeed = 3f;
            repairRadius = 145f;
            powerUse = 5f;
            beamWidth = 1.1f;
            pulseRadius = 6.1f;
            coolantUse = 0.16f;
            coolantMultiplier = 1.6f;
            acceptCoolant = true;
        }};

        //endregion
        //region payloads

        payloadConveyor = new PayloadConveyor("payload-conveyor"){{
            requirements(Category.units, with(Items.graphite, 10));
            canOverdrive = false;
        }};

        payloadRouter = new PayloadRouter("payload-router"){{
            requirements(Category.units, with(Items.graphite, 15));
            canOverdrive = false;
        }};

        payloadPropulsionTower = new PayloadMassDriver("payload-propulsion-tower"){{
            requirements(Category.units, with(Items.thorium, 300, Items.silicon, 200, Items.plastanium, 200, Items.phaseFabric, 50));
            size = 5;
            reloadTime = 130f;
            chargeTime = 100f;
            range = 1000f;
            maxPayloadSize = 3.5f;
            consumes.power(6f);
        }};

        deconstructor = new PayloadDeconstructor("deconstructor"){{
            requirements(Category.units, with(Items.thorium, 250, Items.silicon, 200, Items.graphite, 250));
            itemCapacity = 250;
            consumes.power(3f);
            size = 5;
            deconstructSpeed = 2f;
        }};

        constructor = new Constructor("constructor"){{
            requirements(Category.units, with(Items.silicon, 50, Items.thorium, 70, Items.graphite, 50));
            hasPower = true;
            consumes.power(2f);
            size = 3;
        }};

        //yes this block is pretty much useless
        largeConstructor = new Constructor("large-constructor"){{
            requirements(Category.units, with(Items.silicon, 100, Items.thorium, 150, Items.graphite, 50, Items.phaseFabric, 40));
            hasPower = true;
            consumes.power(2f);
            maxBlockSize = 4;
            minBlockSize = 3;
            size = 5;
        }};

        payloadLoader = new PayloadLoader("payload-loader"){{
            requirements(Category.units, with(Items.graphite, 50, Items.silicon, 50, Items.copper, 100));
            hasPower = true;
            consumes.power(2f);
            size = 3;
        }};

        payloadUnloader = new PayloadUnloader("payload-unloader"){{
            requirements(Category.units, with(Items.graphite, 50, Items.silicon, 50, Items.copper, 100));
            hasPower = true;
            consumes.power(2f);
            size = 3;
        }};

        //deprecated, will be removed.
        blockForge = constructor;
        blockLoader = payloadLoader;
        blockUnloader = payloadUnloader;

        //endregion
        //region sandbox

        powerSource = new PowerSource("power-source"){{
            requirements(Category.power, BuildVisibility.sandboxOnly, with());
            powerProduction = 1000000f / 60f;
            alwaysUnlocked = true;
        }};

        powerVoid = new PowerVoid("power-void"){{
            requirements(Category.power, BuildVisibility.sandboxOnly, with());
            alwaysUnlocked = true;
        }};

        itemSource = new ItemSource("item-source"){{
            requirements(Category.distribution, BuildVisibility.sandboxOnly, with());
            alwaysUnlocked = true;
        }};

        itemVoid = new ItemVoid("item-void"){{
            requirements(Category.distribution, BuildVisibility.sandboxOnly, with());
            alwaysUnlocked = true;
        }};

        liquidSource = new LiquidSource("liquid-source"){{
            requirements(Category.liquid, BuildVisibility.sandboxOnly, with());
            alwaysUnlocked = true;
        }};

        liquidVoid = new LiquidVoid("liquid-void"){{
            requirements(Category.liquid, BuildVisibility.sandboxOnly, with());
            alwaysUnlocked = true;
        }};

        payloadSource = new PayloadSource("payload-source"){{
            requirements(Category.units, BuildVisibility.sandboxOnly, with());
            size = 5;
            alwaysUnlocked = true;
        }};

        payloadVoid = new PayloadVoid("payload-void"){{
            requirements(Category.units, BuildVisibility.sandboxOnly, with());
            size = 5;
            alwaysUnlocked = true;
        }};

        //TODO move
        illuminator = new LightBlock("illuminator"){{
            requirements(Category.effect, BuildVisibility.lightingOnly, with(Items.graphite, 12, Items.silicon, 8, Items.lead, 8));
            brightness = 0.75f;
            radius = 140f;
            consumes.power(0.05f);
        }};

        //endregion
        //region legacy

        //looked up by name, no ref needed
        new LegacyMechPad("legacy-mech-pad");
        new LegacyUnitFactory("legacy-unit-factory");
        new LegacyUnitFactory("legacy-unit-factory-air"){{
            replacement = Blocks.airFactory;
        }};
        new LegacyUnitFactory("legacy-unit-factory-ground"){{
            replacement = Blocks.groundFactory;
        }};

        //endregion
        //region campaign

        launchPad = new LaunchPad("launch-pad"){{
            requirements(Category.effect, BuildVisibility.campaignOnly, with(Items.copper, 350, Items.silicon, 140, Items.lead, 200, Items.titanium, 150));
            size = 3;
            itemCapacity = 100;
            launchTime = 60f * 20;
            hasPower = true;
            consumes.power(4f);
        }};

        interplanetaryAccelerator = new Accelerator("interplanetary-accelerator"){{
            requirements(Category.effect, BuildVisibility.campaignOnly, with(Items.copper, 16000, Items.silicon, 11000, Items.thorium, 13000, Items.titanium, 12000, Items.surgeAlloy, 6000, Items.phaseFabric, 5000));
            researchCostMultiplier = 0.1f;
            size = 7;
            hasPower = true;
            consumes.power(10f);
            buildCostMultiplier = 0.5f;
            health = size * size * 80;
        }};

        //endregion campaign
        //region logic

        message = new MessageBlock("message"){{
            requirements(Category.logic, with(Items.graphite, 5));
        }};

        switchBlock = new SwitchBlock("switch"){{
            requirements(Category.logic, with(Items.graphite, 5));
        }};

        microProcessor = new LogicBlock("micro-processor"){{
            requirements(Category.logic, with(Items.copper, 90, Items.lead, 50, Items.silicon, 50));

            instructionsPerTick = 2;

            size = 1;
        }};

        logicProcessor = new LogicBlock("logic-processor"){{
            requirements(Category.logic, with(Items.lead, 320, Items.silicon, 80, Items.graphite, 60, Items.thorium, 50));

            instructionsPerTick = 8;

            range = 8 * 22;

            size = 2;
        }};

        hyperProcessor = new LogicBlock("hyper-processor"){{
            requirements(Category.logic, with(Items.lead, 450, Items.silicon, 150, Items.thorium, 75, Items.surgeAlloy, 50));

            consumes.liquid(Liquids.cryofluid, 0.08f);
            hasLiquids = true;

            instructionsPerTick = 25;

            range = 8 * 42;

            size = 3;
        }};

        memoryCell = new MemoryBlock("memory-cell"){{
            requirements(Category.logic, with(Items.graphite, 30, Items.silicon, 30));

            memoryCapacity = 64;
        }};

        memoryBank = new MemoryBlock("memory-bank"){{
            requirements(Category.logic, with(Items.graphite, 80, Items.silicon, 80, Items.phaseFabric, 30));

            memoryCapacity = 512;
            size = 2;
        }};

        logicDisplay = new LogicDisplay("logic-display"){{
            requirements(Category.logic, with(Items.lead, 100, Items.silicon, 50, Items.metaglass, 50));

            displaySize = 80;

            size = 3;
        }};

        largeLogicDisplay = new LogicDisplay("large-logic-display"){{
            requirements(Category.logic, with(Items.lead, 200, Items.silicon, 150, Items.metaglass, 100, Items.phaseFabric, 75));

            displaySize = 176;

            size = 6;
        }};

        //endregion
    }
}