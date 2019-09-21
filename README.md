# fun_algorithm
I met this problem during my work and I found it kinda interesting. The task is basically to find the pattern from the two existing model(see below)
and generalize to Argument(n).

Argument is 4:
11A; 12A; 21A; 22A
11B; 12B; 21B; 22B
11C; 12C; 21C; 22C
11D; 12D; 21D; 22D
13A; 14A; 23A; 24A
13B; 14B; 23B; 24B
13C; 14C; 23C; 24C
13D; 14D; 23D; 24D
31A; 32A; 41A; 42A
31B; 32B; 41B; 42B
31C; 32C; 41C; 42C
31D; 32D; 41D; 42D
33A; 34A; 43A; 44A
33B; 34B; 43B; 44B
33C; 34C; 43C; 44C
33D; 34D; 43D; 44D

Argument is 9:
11A; 12A; 13A; 21A; 22A; 23A; 31A; 32A; 33A
11B; 12B; 13B; 21B; 22B; 23B; 31B; 32B; 33B
11C; 12C; 13C; 21C; 22C; 23C; 31C; 32C; 33C
11D; 12D; 13D; 21D; 22D; 23D; 31D; 32D; 33D
11E; 12E; 13E; 21E; 22E; 23E; 31E; 32E; 33E
11F; 12F; 13F; 21F; 22F; 23F; 31F; 32F; 33F
11G; 12G; 13G; 21G; 22G; 23G; 31G; 32G; 33G
11H; 12H; 13H; 21H; 22H; 23H; 31H; 32H; 33H
11I; 12I; 13I; 21I; 22I; 23I; 31I; 32I; 33I
14A; 15A; 16A; 24A; 25A; 26A; 34A; 35A; 36A
14B; 15B; 16B; 24B; 25B; 26B; 34B; 35B; 36B
14C; 15C; 16C; 24C; 25C; 26C; 34C; 35C; 36C
14D; 15D; 16D; 24D; 25D; 26D; 34D; 35D; 36D
14E; 15E; 16E; 24E; 25E; 26E; 34E; 35E; 36E
14F; 15F; 16F; 24F; 25F; 26F; 34F; 35F; 36F
14G; 15G; 16G; 24G; 25G; 26G; 34G; 35G; 36G
14H; 15H; 16H; 24H; 25H; 26H; 34H; 35H; 36H
14I; 15I; 16I; 24I; 25I; 26I; 34I; 35I; 36I
17A; 18A; 19A; 27A; 28A; 29A; 37A; 38A; 39A
17B; 18B; 19B; 27B; 28B; 29B; 37B; 38B; 39B
17C; 18C; 19C; 27C; 28C; 29C; 37C; 38C; 39C
17D; 18D; 19D; 27D; 28D; 29D; 37D; 38D; 39D
17E; 18E; 19E; 27E; 28E; 29E; 37E; 38E; 39E
17F; 18F; 19F; 27F; 28F; 29F; 37F; 38F; 39F
17G; 18G; 19G; 27G; 28G; 29G; 37G; 38G; 39G
17H; 18H; 19H; 27H; 28H; 29H; 37H; 38H; 39H
17I; 18I; 19I; 27I; 28I; 29I; 37I; 38I; 39I
41A; 42A; 43A; 51A; 52A; 53A; 61A; 62A; 63A
41B; 42B; 43B; 51B; 52B; 53B; 61B; 62B; 63B
41C; 42C; 43C; 51C; 52C; 53C; 61C; 62C; 63C
41D; 42D; 43D; 51D; 52D; 53D; 61D; 62D; 63D
41E; 42E; 43E; 51E; 52E; 53E; 61E; 62E; 63E
41F; 42F; 43F; 51F; 52F; 53F; 61F; 62F; 63F
41G; 42G; 43G; 51G; 52G; 53G; 61G; 62G; 63G
41H; 42H; 43H; 51H; 52H; 53H; 61H; 62H; 63H
41I; 42I; 43I; 51I; 52I; 53I; 61I; 62I; 63I
44A; 45A; 46A; 54A; 55A; 56A; 64A; 65A; 66A
44B; 45B; 46B; 54B; 55B; 56B; 64B; 65B; 66B
44C; 45C; 46C; 54C; 55C; 56C; 64C; 65C; 66C
44D; 45D; 46D; 54D; 55D; 56D; 64D; 65D; 66D
44E; 45E; 46E; 54E; 55E; 56E; 64E; 65E; 66E
44F; 45F; 46F; 54F; 55F; 56F; 64F; 65F; 66F
44G; 45G; 46G; 54G; 55G; 56G; 64G; 65G; 66G
44H; 45H; 46H; 54H; 55H; 56H; 64H; 65H; 66H
44I; 45I; 46I; 54I; 55I; 56I; 64I; 65I; 66I
47A; 48A; 49A; 57A; 58A; 59A; 67A; 68A; 69A
47B; 48B; 49B; 57B; 58B; 59B; 67B; 68B; 69B
47C; 48C; 49C; 57C; 58C; 59C; 67C; 68C; 69C
47D; 48D; 49D; 57D; 58D; 59D; 67D; 68D; 69D
47E; 48E; 49E; 57E; 58E; 59E; 67E; 68E; 69E
47F; 48F; 49F; 57F; 58F; 59F; 67F; 68F; 69F
47G; 48G; 49G; 57G; 58G; 59G; 67G; 68G; 69G
47H; 48H; 49H; 57H; 58H; 59H; 67H; 68H; 69H
47I; 48I; 49I; 57I; 58I; 59I; 67I; 68I; 69I
71A; 72A; 73A; 81A; 82A; 83A; 91A; 92A; 93A
71B; 72B; 73B; 81B; 82B; 83B; 91B; 92B; 93B
71C; 72C; 73C; 81C; 82C; 83C; 91C; 92C; 93C
71D; 72D; 73D; 81D; 82D; 83D; 91D; 92D; 93D
71E; 72E; 73E; 81E; 82E; 83E; 91E; 92E; 93E
71F; 72F; 73F; 81F; 82F; 83F; 91F; 92F; 93F
71G; 72G; 73G; 81G; 82G; 83G; 91G; 92G; 93G
71H; 72H; 73H; 81H; 82H; 83H; 91H; 92H; 93H
71I; 72I; 73I; 81I; 82I; 83I; 91I; 92I; 93I
74A; 75A; 76A; 84A; 85A; 86A; 94A; 95A; 96A
74B; 75B; 76B; 84B; 85B; 86B; 94B; 95B; 96B
74C; 75C; 76C; 84C; 85C; 86C; 94C; 95C; 96C
74D; 75D; 76D; 84D; 85D; 86D; 94D; 95D; 96D
74E; 75E; 76E; 84E; 85E; 86E; 94E; 95E; 96E
74F; 75F; 76F; 84F; 85F; 86F; 94F; 95F; 96F
74G; 75G; 76G; 84G; 85G; 86G; 94G; 95G; 96G
74H; 75H; 76H; 84H; 85H; 86H; 94H; 95H; 96H
74I; 75I; 76I; 84I; 85I; 86I; 94I; 95I; 96I
77A; 78A; 79A; 87A; 88A; 89A; 97A; 98A; 99A
77B; 78B; 79B; 87B; 88B; 89B; 97B; 98B; 99B
77C; 78C; 79C; 87C; 88C; 89C; 97C; 98C; 99C
77D; 78D; 79D; 87D; 88D; 89D; 97D; 98D; 99D
77E; 78E; 79E; 87E; 88E; 89E; 97E; 98E; 99E
77F; 78F; 79F; 87F; 88F; 89F; 97F; 98F; 99F
77G; 78G; 79G; 87G; 88G; 89G; 97G; 98G; 99G
77H; 78H; 79H; 87H; 88H; 89H; 97H; 98H; 99H
77I; 78I; 79I; 87I; 88I; 89I; 97I; 98I; 99I
